package com.examly.springapploan.model;

import jakarta.persistence.*;

@Entity
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loanId;

    private String loanType;
    private double interestRate;
    private double maxAmount;
    private double minAmount;
    private int minTenureMonths;
    private int maxTenureMonths;
    private String description;
    private String status;

    // Getters and Setters
    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(double maxAmount) {
        this.maxAmount = maxAmount;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public int getMinTenureMonths() {
        return minTenureMonths;
    }

    public void setMinTenureMonths(int minTenureMonths) {
        this.minTenureMonths = minTenureMonths;
    }

    public int getMaxTenureMonths() {
        return maxTenureMonths;
    }

    public void setMaxTenureMonths(int maxTenureMonths) {
        this.maxTenureMonths = maxTenureMonths;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}