package com.example.finance_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.finance_backend.dto.ReportResponse;
import com.example.finance_backend.response.ApiResponse;
import com.example.finance_backend.service.ReportService;

@RestController
@RequestMapping("/api/reports")
@CrossOrigin(origins = "http://localhost:5173")
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/{userId}")
    public ResponseEntity<ApiResponse<ReportResponse>> getReport(@PathVariable Long userId) {

        ReportResponse data = reportService.getReport(userId);

        return ResponseEntity.ok(
            new ApiResponse<>(200, "Report fetched", data)
        );
    }
}
