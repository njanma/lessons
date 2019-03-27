package by.itacademy.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String firstName;
    private String lastName;
    private Role role;

    public String fullName() {
        return firstName + " " + lastName;
    }

    public enum Role{
        ADMIN, USER
    }
}
