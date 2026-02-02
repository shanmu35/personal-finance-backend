package com.example.finance_backend.dto;

import java.time.LocalDate;

public class TransactionDTO {

    private LocalDate date;
    private String type;
    private String category;
    private Double amount;

    public TransactionDTO(LocalDate date, String type, String category, Double amount) {
        this.date = date;
        this.type = type;
        this.category = category;
        this.amount = amount;
    }

    public LocalDate getDate() { return date; }
    public String getType() { return type; }
    public String getCategory() { return category; }
    public Double getAmount() { return amount; }
}
