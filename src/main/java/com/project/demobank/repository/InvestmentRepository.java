package com.project.demobank.repository;

import com.project.demobank.model.Investments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investments, Long> {
}
