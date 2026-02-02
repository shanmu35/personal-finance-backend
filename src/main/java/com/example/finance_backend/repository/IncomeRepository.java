//package com.example.finance_backend.repository;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import com.example.finance_backend.model.Income;
//import java.util.List;
//
//public interface IncomeRepository extends JpaRepository<Income, Long> {
//    List<Income> findByUserId(Long userId);
//}



package com.example.finance_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.finance_backend.model.Income;

public interface IncomeRepository extends JpaRepository<Income, Long> {
	
	@Query("SELECT COALESCE(SUM(i.amount), 0) FROM Income i WHERE i.userId = :userId")
	Double getTotalIncome(Long userId);

	List<Income> findByUserId(Long userId);

}
