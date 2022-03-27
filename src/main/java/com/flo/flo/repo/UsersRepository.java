package com.flo.flo.repo;

import com.flo.flo.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
    Users findByEmail_us(String email_us);
}