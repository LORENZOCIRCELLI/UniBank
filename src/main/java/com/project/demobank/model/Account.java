package com.project.demobank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Accounts")
@Setter
@Getter
public class Account {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String accountNumber;
    private String agency;
    private Double balance;
    private AccountType accountType;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "originAccount", cascade = CascadeType.ALL)
    private List<Transaction> sourceTransactions;

    @OneToMany(mappedBy = "destinyAccount", cascade = CascadeType.ALL)
    private List<Transaction> destinyTransactions;



}
