package com.example.finance_backend.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.finance_backend.model.Login;
import com.example.finance_backend.service.LoginService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {

    @Autowired
    private LoginService loginService;

    // REGISTER API
    @PostMapping("/register")
    public Login register(@RequestBody Login login) {
        return loginService.register(login);
    }

    // LOGIN API
    @PostMapping("/login")
    public String login(@RequestBody Login login) {
        Login user = loginService.login(login.getEmail(), login.getPassword());

        if (user != null) {
            return "LOGIN_SUCCESS";
        } else {
            return "INVALID_CREDENTIALS";
        }
    }
}
