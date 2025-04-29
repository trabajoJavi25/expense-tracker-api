package com.personalprojects.expensetracker.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * UserResponseDto is a Data Transfer Object (DTO) that represents the response
 * structure for user-related operations in the Expense Tracker application.
 * It contains fields such as userId, username, firstName, lastName, email, and phone.
 * This DTO is used to transfer user data between different layers of the application.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserResponseDto {

    private Long userId;
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
