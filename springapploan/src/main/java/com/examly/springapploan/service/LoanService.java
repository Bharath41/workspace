
package com.examly.springapploan.service;

import com.examly.springapploan.model.Loan;

import java.util.List;

public interface LoanService {
    Loan saveLoan(Loan loan);

    List<Loan> getAllLoans();

    Loan getLoanById(int loanId);

    Loan updateLoan(int loanId, Loan loan);

    void deleteLoan(int loanId);
}