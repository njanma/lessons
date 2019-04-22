package _13_refactoring;


import io.vavr.Tuple2;

import java.util.List;
import java.util.Set;

public interface TeamService {

    Team createTeam(String name, String description, String avatarUrl);

    Team getTeam(Long id);

    void updateTeam(Team team);

    List<Tuple2<VerificationCode, Team>> getJoinedTeams(VerificationCode verificationCode);

    List<Team> getTeams(Set<Long> teamIds);

    boolean hasAnyTokensWithEmail(String userEmail);

    List<VerificationCode> getVerificationCodeList(String email, String verificationType, Long teamId);

    void deleteVerificationCode(String verificationCode);

    void deleteVerificationCodes(List<String> verificationCodes);

    TeamParticipants changeTeamParticipant(Long moveToOwner, Long moveToAdmin, Long moveToParticipant, Long teamId);

    TeamParticipants getTeamParticipant(Long teamId);

    void saveTeamParticipant(TeamParticipants teamParticipants);
}
