//package com.example.finance_backend.service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.finance_backend.model.User;
//import com.example.finance_backend.repository.UserRepository;
//
////@Service
//public class AuthService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public User register(User user) {
//        return userRepository.save(user);
//    }
//}




//package com.example.finance_backend.service;
//
//import com.example.finance_backend.exception.EmailAlreadyExistsException;
//import com.example.finance_backend.exception.UserNotFoundException;
//import com.example.finance_backend.model.User;
//import com.example.finance_backend.repository.UserRepository;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private BCryptPasswordEncoder encoder;
//
//    public User register(User user) {
//
//        if (userRepository.existsByEmail(user.getEmail())) {
//            throw new EmailAlreadyExistsException("Email already registered");
//        }
//
//        user.setPassword(encoder.encode(user.getPassword()));
//        return userRepository.save(user);
//    }
//
//    public User login(String email, String password) {
//
//        User user = userRepository.findByEmail(email)
//                .orElseThrow(() ->
//                        new UserNotFoundException("User not found")
//                );
//
//        if (!encoder.matches(password, user.getPassword())) {
//            throw new RuntimeException("Invalid password");
//        }
//
//        return user;
//    }
//}



package com.example.finance_backend.service;

import com.example.finance_backend.exception.EmailAlreadyExistsException;
import com.example.finance_backend.exception.UserNotFoundException;
import com.example.finance_backend.model.User;
import com.example.finance_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    public User register(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new EmailAlreadyExistsException("Email already registered");
        }

        user.setPassword(encoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public User login(String email, String password) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found")
                );

        if (!encoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return user;
    }
}
