package com.project.demobank.services;

import com.project.demobank.model.Account;
import com.project.demobank.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountServiceImplementation implements AccountService {

    public AccountServiceImplementation() {}

    public Account createAccount(){return null;}
    public void deleteAccount(){}
    public List<Account> listAllAccounts(){

        List<Account> accounts = new ArrayList<Account>();


        return null;

    }
    //Admin Feature
    public void changeAccountAccess(){}

    public Account updateAccount(){return null;}
    //Admin Feature
    public Account getAccount(Long Id){

        List<Account> allAccounts = listAllAccounts();
        Account searchedACcount = allAccounts.stream().filter(c -> c.getId().equals(Id)).findFirst().orElse(null);
        return searchedACcount;

    }

}
