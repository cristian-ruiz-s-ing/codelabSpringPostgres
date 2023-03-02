package com.codelab.postgres.codelab.data.repository;

import com.codelab.postgres.codelab.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}