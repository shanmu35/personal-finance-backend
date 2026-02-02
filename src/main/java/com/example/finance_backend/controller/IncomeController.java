//package com.example.finance_backend.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import java.util.List;
//
//import com.example.finance_backend.model.Income;
//import com.example.finance_backend.service.IncomeService;
//
//@RestController
//@RequestMapping("/api/income")
//@CrossOrigin(origins = "http://localhost:5173")
//public class IncomeController {
//
//    @Autowired
//    private IncomeService service;
//
//    @PostMapping("/add")
//    public Income addIncome(@RequestBody Income income) {
//        return service.addIncome(income);
//    }
//
//    @GetMapping("/user/{userId}")
//    public List<Income> getUserIncome(@PathVariable Long userId) {
//        return service.getIncomeByUser(userId);
//    }
//}




//package com.example.finance_backend.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.finance_backend.model.Income;
//import com.example.finance_backend.service.IncomeService;
//
//@RestController
//@RequestMapping("/api/income")
//@CrossOrigin(origins = "http://localhost:5173")
//public class IncomeController {
//
//    @Autowired
//    private IncomeService incomeService;
//
//    @PostMapping("/add")
//    public Income addIncome(@RequestBody Income income) {
//        return incomeService.addIncome(income);
//    }
//}






package com.example.finance_backend.controller;

import com.example.finance_backend.model.Income;
import com.example.finance_backend.response.ApiResponse;
import com.example.finance_backend.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/income")
@CrossOrigin(origins = "http://localhost:5173")
public class IncomeController {

    @Autowired
    private IncomeService incomeService;

    @PostMapping("/add")
    public ResponseEntity<ApiResponse<Income>> addIncome(@RequestBody Income income) {

        Income savedIncome = incomeService.addIncome(income);

        ApiResponse<Income> response = new ApiResponse<>(
                200,
                "Income added successfully",
                savedIncome
        );

        return ResponseEntity.ok(response);
    }
}


