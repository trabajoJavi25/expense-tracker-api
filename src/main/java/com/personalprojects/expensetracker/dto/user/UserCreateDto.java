package com.personalprojects.expensetracker.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserCreateDto is a Data Transfer Object (DTO) used for creating a new user.
 * It contains fields for user details such as userId, password, username, firstName,
 * lastName, email, and phone. The class is annotated with Lombok annotations to
 * automatically generate boilerplate code like getters, setters, constructors,
 * and builder methods.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserCreateDto {
    private Long userId;
    private String password;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
