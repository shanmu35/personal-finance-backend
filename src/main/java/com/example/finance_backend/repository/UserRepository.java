package com.example.finance_backend.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.finance_backend.model.User;
//public interface UserRepository extends JpaRepository<User, Long> {
//
//    User findByEmail(String email);
//}


public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
