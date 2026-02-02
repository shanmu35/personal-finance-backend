//package com.example.finance_backend.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.example.finance_backend.model.Expense;
//
//public interface ExpenseRepository extends JpaRepository<Expense, Long> {
//}



package com.example.finance_backend.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.finance_backend.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    @Query("SELECT COALESCE(SUM(e.amount), 0) FROM Expense e WHERE e.userId = :userId")
    Double getTotalExpense(Long userId);

    List<Expense> findByUserId(Long userId);
}
