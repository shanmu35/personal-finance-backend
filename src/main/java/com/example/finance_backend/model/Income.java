//package com.example.finance_backend.model;
//
//import jakarta.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "income")
//public class Income {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private double amount;
//    private String source;
//    private LocalDate date;
//
//    private Long userId;
//
//    // getters & setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public double getAmount() { return amount; }
//    public void setAmount(double amount) { this.amount = amount; }
//
//    public String getSource() { return source; }
//    public void setSource(String source) { this.source = source; }
//
//    public LocalDate getDate() { return date; }
//    public void setDate(LocalDate date) { this.date = date; }
//
//    public Long getUserId() { return userId; }
//    public void setUserId(Long userId) { this.userId = userId; }
//}





//package com.example.finance_backend.model;
//
//import jakarta.persistence.*;
//import java.time.LocalDate;
//
//@Entity
//@Table(name = "income")
//public class Income {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private Double amount;
//    private String source;
//    private LocalDate date;
//
//    @Column(name = "user_id")
//    private Long userId;
//
//    // getters & setters
//    public Long getId() { return id; }
//    public void setId(Long id) { this.id = id; }
//
//    public Double getAmount() { return amount; }
//    public void setAmount(Double amount) { this.amount = amount; }
//
//    public String getSource() { return source; }
//    public void setSource(String source) { this.source = source; }
//
//    public LocalDate getDate() { return date; }
//    public void setDate(LocalDate date) { this.date = date; }
//
//    public Long getUserId() { return userId; }
//    public void setUserId(Long userId) { this.userId = userId; }
//}






package com.example.finance_backend.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "income")
public class Income {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;
    private String source;
    private LocalDate date;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    // getters & setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}

