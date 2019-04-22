package _13_refactoring;

import lombok.Data;

import java.io.Serializable;
import java.util.Set;

@Data
public class TeamParticipants implements Serializable {
    private Long teamId;
    private Set<Long> owners;
    private Set<Long> admins;
    private Set<Long> participants;
}
