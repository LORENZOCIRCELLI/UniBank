package com.project.demobank.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "investments")
@Getter
@Setter
public class Investments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;

    @Enumerated(EnumType.STRING)
    private InvestmentType investmentType;

    private Double investedAmount;
    private Double expectedReturnRate;
    private Integer durationInMonths;

    private LocalDate startDate;
    private LocalDate endDate;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Account account;

}
