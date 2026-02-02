package com.example.finance_backend.service;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.finance_backend.dto.*;
import com.example.finance_backend.repository.*;

@Service
public class ReportService {

    @Autowired
    private IncomeRepository incomeRepo;

    @Autowired
    private ExpenseRepository expenseRepo;

    public ReportResponse getReport(Long userId) {

        Double income = incomeRepo.getTotalIncome(userId);
        Double expense = expenseRepo.getTotalExpense(userId);

        ReportResponse report = new ReportResponse();
        report.setTotalIncome(income);
        report.setTotalExpense(expense);
        report.setSavings(income - expense);
        report.setBalance(income - expense);

        List<TransactionDTO> list = new ArrayList<>();

        incomeRepo.findByUserId(userId).forEach(i ->
            list.add(new TransactionDTO(
                i.getDate(), "Income", i.getSource(), i.getAmount()
            ))
        );

        expenseRepo.findByUserId(userId).forEach(e ->
            list.add(new TransactionDTO(
                e.getDate(), "Expense", e.getCategory(), e.getAmount()
            ))
        );

        report.setTransactions(list);
        return report;
    }
}
