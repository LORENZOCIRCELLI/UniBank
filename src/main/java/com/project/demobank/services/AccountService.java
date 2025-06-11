package com.project.demobank.services;

import com.project.demobank.model.Account;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AccountService {

    Account createAccount();
    void deleteAccount();
    Account updateAccount();
    void changeAccountAccess();
    List<Account> listAllAccounts();



}
