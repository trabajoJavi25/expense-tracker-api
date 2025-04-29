package com.personalprojects.expensetracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User entity class representing a user in the system.
 * This class is mapped to the "USERS" table in the database.
 * It contains fields for user ID, password, username, first name, last name, email, and phone number.
 * The class uses Lombok annotations for boilerplate code generation.
 */
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USERID", nullable = false, unique = true, length = 50)
    private Long  userId;
    @Column(name = "PASSWORD",nullable = false)
    private String passwordHash;
    @Column(name = "USERNAME",nullable = false, unique = true)
    private String username;
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;
    @Column(name = "PHONE", length = 15)
    private String phone;

}
