package com.example.finance_backend.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finance_backend.model.Login;
import com.example.finance_backend.repository.LoginRepository;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    // REGISTER
    public Login register(Login login) {
        return loginRepository.save(login);
    }

    // LOGIN
    public Login login(String email, String password) {
        Login user = loginRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
}
