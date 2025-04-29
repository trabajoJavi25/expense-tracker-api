package com.personalprojects.expensetracker.repository;

import com.personalprojects.expensetracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository interface for managing User entities.
 * It extends JpaRepository to provide CRUD operations.
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
