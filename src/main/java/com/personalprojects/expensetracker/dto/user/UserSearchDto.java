package com.personalprojects.expensetracker.dto.user;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * UserSearchDto is a Data Transfer Object (DTO) that represents the search criteria for users.
 * It is used to encapsulate the parameters needed to search for users in the system.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserSearchDto {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
