package _12_refactoring;

import scala.Tuple2;

import java.util.List;
import java.util.Set;

public interface TeamDao {

    Team createTeam(Team team);

    Team getTeam(Long id);

    List<Team> getTeams(Set<Long> teamIds);

    Team findTeamByName(String name);

    void updateTeam(Team team);

    List<Tuple2<VerificationCode, Team>> getJoinedTeams(VerificationCode verificationCode);

    boolean hasAnyTokensWithEmail(String userEmail);

    List<VerificationCode> getVerificationCodeList(String email, String verificationType, Long teamId);

    void deleteVerificationCode(String verificationCode);

    void deleteVerificationCodes(List<String> verificationCodes);

}
