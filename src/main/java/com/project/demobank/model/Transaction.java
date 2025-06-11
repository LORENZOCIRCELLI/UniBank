package com.project.demobank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
@Getter
@Setter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateHour;
    private Double value;
    private TransactionType type;

    @ManyToOne
    private Account sourceAccount;

    @ManyToOne
    private Account destinyAccount;
}
