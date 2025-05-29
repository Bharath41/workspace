package com.examly.springapploan.service;

import com.examly.springapploan.model.LoanApplication;
import java.util.List;

public interface LoanApplicationService {
    LoanApplication applyLoan(LoanApplication loanApplication);

    List<LoanApplication> getAllApplications();

    List<LoanApplication> getApplicationsByUserId(int userId);

    LoanApplication updateApplicationStatus(int id, String status);

    void deleteApplication(int id);
}