//package com.example.finance_backend.controller;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.finance_backend.model.User;
//import com.example.finance_backend.service.AuthService;
//
//@RestController
//@RequestMapping("/api/auth")
//@CrossOrigin(origins = "http://localhost:5173") // React URL
//public class AuthController {
//	@Autowired
//    private AuthService authService;
//
//    @PostMapping("/login")
//    public User register(@RequestBody User user) {
//        return authService.register(user);
//    }
//    }



//package com.example.finance_backend.controller;
//
//import com.example.finance_backend.model.User;
//import com.example.finance_backend.response.ApiResponse;
//import com.example.finance_backend.service.AuthService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/auth")
//@CrossOrigin(origins = "http://localhost:5173")
//public class AuthController {
//
//    @Autowired
//    private AuthService authService;
//
//    // REGISTER
//    @PostMapping("/register")
//    public ResponseEntity<ApiResponse<User>> register(@RequestBody User user) {
//
//        User savedUser = authService.register(user);
//
//        return ResponseEntity.ok(
//                new ApiResponse<>(200, "User registered successfully", savedUser)
//        );
//    }
//
//    // LOGIN
//    @PostMapping("/login")
//    public ResponseEntity<ApiResponse<User>> login(@RequestBody User user) {
//
//        User loggedUser = authService.login(
//                user.getEmail(),
//                user.getPassword()
//        );
//
//        return ResponseEntity.ok(
//                new ApiResponse<>(200, "Login successful", loggedUser)
//        );
//    }
//}



package com.example.finance_backend.controller;

import com.example.finance_backend.model.User;
import com.example.finance_backend.response.ApiResponse;
import com.example.finance_backend.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:5173")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<User>> register(@RequestBody User user) {

        User savedUser = authService.register(user);

        return ResponseEntity.ok(
                new ApiResponse<>(200, "User registered successfully", savedUser)
        );
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<User>> login(@RequestBody User user) {

        User loggedUser = authService.login(
                user.getEmail(),
                user.getPassword()
        );

        return ResponseEntity.ok(
                new ApiResponse<>(200, "Login successful", loggedUser)
        );
    }
}
