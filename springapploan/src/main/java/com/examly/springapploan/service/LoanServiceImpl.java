package com.examly.springapploan.service;

import com.examly.springapploan.model.Loan;
import com.examly.springapploan.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanServiceImpl implements LoanService {

    @Autowired
    private LoanRepository loanRepository;

    @Override
    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    @Override
    public Loan getLoanById(int loanId) {
        return loanRepository.findById(loanId).orElse(null);
    }

    @Override
    public Loan updateLoan(int loanId, Loan loan) {
        Optional<Loan> optionalLoan = loanRepository.findById(loanId);
        if (optionalLoan.isPresent()) {
            Loan existing = optionalLoan.get();
            existing.setLoanType(loan.getLoanType());
            existing.setInterestRate(loan.getInterestRate());
            existing.setMaxAmount(loan.getMaxAmount());
            existing.setMinAmount(loan.getMinAmount());
            existing.setMinTenureMonths(loan.getMinTenureMonths());
            existing.setMaxTenureMonths(loan.getMaxTenureMonths());
            existing.setDescription(loan.getDescription());
            existing.setStatus(loan.getStatus());
            return loanRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteLoan(int loanId) {
        loanRepository.deleteById(loanId);
    }
}