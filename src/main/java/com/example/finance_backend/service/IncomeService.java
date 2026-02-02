//package com.example.finance_backend.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//import com.example.finance_backend.model.Income;
//import com.example.finance_backend.repository.IncomeRepository;
//
//@Service
//public class IncomeService {
//
//    @Autowired
//    private IncomeRepository repo;
//
//    public Income addIncome(Income income) {
//        return repo.save(income);
//    }
//
//    public List<Income> getIncomeByUser(Long userId) {
//        return repo.findByUserId(userId);
//    }
//}



//package com.example.finance_backend.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.example.finance_backend.model.Income;
//import com.example.finance_backend.repository.IncomeRepository;
//
//@Service
//public class IncomeService {
//
//    @Autowired
//    private IncomeRepository incomeRepository;
//
//    public Income addIncome(Income income) {
//        return incomeRepository.save(income);
//    }
//}





//package com.example.finance_backend.service;
//
//import com.example.finance_backend.exception.UserNotFoundException;
//import com.example.finance_backend.model.Income;
//import com.example.finance_backend.model.User;
//import com.example.finance_backend.repository.IncomeRepository;
//import com.example.finance_backend.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class IncomeService {
//
//    @Autowired
//    private IncomeRepository incomeRepository;
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public Income addIncome(Income income) {
//
//        Long userId = income.getUserId(); // ✅ FIXED
//
//        User user = userRepository.findById(userId)
//                .orElseThrow(() ->
//                        new UserNotFoundException("User not found with id " + userId)
//                );
//
//        return incomeRepository.save(income);
//    }
//}







package com.example.finance_backend.service;

import com.example.finance_backend.exception.UserNotFoundException;
import com.example.finance_backend.model.Income;
import com.example.finance_backend.repository.IncomeRepository;
import com.example.finance_backend.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    @Autowired
    private UserRepository userRepository;

    public Income addIncome(Income income) {

        Long userId = income.getUserId();

        // 🔴 Validate user exists
        userRepository.findById(userId)
                .orElseThrow(() ->
                        new UserNotFoundException("User not found with id " + userId)
                );

        // ✅ save income
        return incomeRepository.save(income);
    }
}
