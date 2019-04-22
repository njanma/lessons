package _13_refactoring;

import lombok.Data;

@Data
public class VerificationCode {
    private String code;
    private boolean confirmed;
    private Team team;
    private Long initiatorId;
}
