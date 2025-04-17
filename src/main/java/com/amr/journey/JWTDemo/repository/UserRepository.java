package com.amr.journey.JWTDemo.repository;

import com.amr.journey.JWTDemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);
    boolean existsByUserName(String userName);
}
