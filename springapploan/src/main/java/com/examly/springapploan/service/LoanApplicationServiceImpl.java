package com.examly.springapploan.service;

import com.examly.springapploan.model.LoanApplication;
import com.examly.springapploan.repository.LoanApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoanApplicationServiceImpl implements LoanApplicationService {

    @Autowired
    private LoanApplicationRepository repository;

    @Override
    public LoanApplication applyLoan(LoanApplication loanApplication) {
        return repository.save(loanApplication);
    }

    @Override
    public List<LoanApplication> getAllApplications() {
        return repository.findAll();
    }

    @Override
    public List<LoanApplication> getApplicationsByUserId(int userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public LoanApplication updateApplicationStatus(int id, String status) {
        Optional<LoanApplication> optional = repository.findById(id);
        if (optional.isPresent()) {
            LoanApplication app = optional.get();
            app.setStatus(status);
            return repository.save(app);
        }
        throw new RuntimeException("Application not found");
    }

    @Override
    public void deleteApplication(int id) {
        repository.deleteById(id);
    }
}