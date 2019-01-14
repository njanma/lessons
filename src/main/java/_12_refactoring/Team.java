package _12_refactoring;

import lombok.Data;

import java.util.Set;

@Data
public class Team {
    private Long id;
    private String name;
    private String description;
    private String avatarUrl;
    private Set<User> users;
}
