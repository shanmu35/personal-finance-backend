package com.example.finance_backend.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.finance_backend.model.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

    Login findByEmail(String email);
}
