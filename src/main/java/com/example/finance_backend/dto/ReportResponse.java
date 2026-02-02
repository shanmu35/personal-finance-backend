package com.example.finance_backend.dto;

import java.util.List;

public class ReportResponse {

    private Double totalIncome;
    private Double totalExpense;
    private Double savings;
    private Double balance;
    private List<TransactionDTO> transactions;

    public Double getTotalIncome() { return totalIncome; }
    public void setTotalIncome(Double totalIncome) { this.totalIncome = totalIncome; }

    public Double getTotalExpense() { return totalExpense; }
    public void setTotalExpense(Double totalExpense) { this.totalExpense = totalExpense; }

    public Double getSavings() { return savings; }
    public void setSavings(Double savings) { this.savings = savings; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }

    public List<TransactionDTO> getTransactions() { return transactions; }
    public void setTransactions(List<TransactionDTO> transactions) {
        this.transactions = transactions;
    }
}
