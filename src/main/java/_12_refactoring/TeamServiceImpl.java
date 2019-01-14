package _12_refactoring;

import scala.Tuple2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TeamServiceImpl implements TeamService {

    private TeamDao teamDAO;
    private TeamParticipantDao teamParticipantDAO;

    @Override
    public Team createTeam(String name, String description, String avatarUrl) {
        if (avatarUrl == null || avatarUrl.equals("")) {
            avatarUrl = "defaultUrl";
        }
        Team existingTeam = teamDAO.findTeamByName(name);
        if (existingTeam != null) {
            throw new InnerServiceException();
        }

        Team team = new Team();
        team.setName(name);
        team.setDescription(description);
        team.setAvatarUrl(avatarUrl);
        team = teamDAO.createTeam(team);
        return team;
    }

    @Override
    public Team getTeam(Long id) {
        return teamDAO.getTeam(id);
    }

    @Override
    public void updateTeam(Team team) {
        teamDAO.updateTeam(team);
    }

    @Override
    public List<Tuple2<VerificationCode, Team>> getJoinedTeams(VerificationCode verificationCode) {
        return teamDAO.getJoinedTeams(verificationCode);
    }

    @Override
    public List<Team> getTeams(Set<Long> teamIds) {
        if (teamIds == null || teamIds.isEmpty()) {
            return Collections.emptyList();
        }
        Set<Long> ids = new HashSet<>(teamIds);
        List<Team> result = new ArrayList<>();
        if (!ids.isEmpty()) {
            List<Team> teams = teamDAO.getTeams(ids);
            result.addAll(emptyIfNull(teams));
        }
        return result;
    }

    @Override
    public boolean hasAnyTokensWithEmail(String userEmail) {
        return teamDAO.hasAnyTokensWithEmail(userEmail);
    }

    @Override
    public List<VerificationCode> getVerificationCodeList(String email, String verificationType, Long teamId) {
        return teamDAO.getVerificationCodeList(email, verificationType, teamId);
    }

    @Override
    public void deleteVerificationCode(String verificationCode) {
        teamDAO.deleteVerificationCode(verificationCode);
    }

    @Override
    public void deleteVerificationCodes(List<String> verificationCodes) {
        teamDAO.deleteVerificationCodes(verificationCodes);
    }

    @Override
    public TeamParticipants changeTeamParticipant(Long moveToOwner, Long moveToAdmin, Long moveToParticipant, Long teamId) {
        DataStoreService datastore = ServiceFactory.getTransactionalDatastoreService();
        return datastore.runInTransaction(() -> {
            TeamParticipants teamParticipants = teamParticipantDAO.get(datastore, teamId);
            if (moveToOwner != null) {
                teamParticipants.getOwners().add(moveToOwner);
                teamParticipants.getAdmins().remove(moveToOwner);
                teamParticipants.getParticipants().remove(moveToOwner);
            }
            if (moveToAdmin != null) {
                teamParticipants.getOwners().remove(moveToAdmin);
                teamParticipants.getAdmins().add(moveToAdmin);
                teamParticipants.getParticipants().remove(moveToAdmin);
            }
            if (moveToParticipant != null) {
                teamParticipants.getOwners().remove(moveToParticipant);
                teamParticipants.getAdmins().remove(moveToParticipant);
                teamParticipants.getParticipants().add(moveToParticipant);
            }
            teamParticipantDAO.save(datastore, teamParticipants);
            return teamParticipants;
        });
    }

    @Override
    public TeamParticipants getTeamParticipant(Long teamId) {
        TeamParticipants result = null;
        DataStoreService datastore = ServiceFactory.getTransactionalDatastoreService();
        result = datastore.runInTransaction(() -> teamParticipantDAO.get(datastore, teamId));
        return result;
    }

    @Override
    public void saveTeamParticipant(TeamParticipants teamParticipants) {
        DataStoreService datastore = ServiceFactory.getTransactionalDatastoreService();
        datastore.runInTransaction(() -> {
            teamParticipantDAO.save(datastore, teamParticipants);
            return null;
        });
    }

    private static <E> Collection<E> emptyIfNull(Collection<E> collection) {
        return collection == null || collection.isEmpty()
                ? Collections.emptyList()
                : collection;
    }
}
