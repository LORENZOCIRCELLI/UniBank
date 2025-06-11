package com.project.demobank.repository;

import com.project.demobank.model.Account;
import lombok.Data;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByAccountNumber(String accountNumber);

}
