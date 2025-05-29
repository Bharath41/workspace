package com.examly.springapploan.controller;

import com.examly.springapploan.model.LoanApplication;
import com.examly.springapploan.service.LoanApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/loanapplications")
@CrossOrigin(origins = "*")
public class LoanApplicationController {

    @Autowired
    private LoanApplicationService service;

    @PostMapping("/apply")
    public LoanApplication applyLoan(@RequestBody LoanApplication loanApplication) {
        return service.applyLoan(loanApplication);
    }

    @GetMapping("/all")
    public List<LoanApplication> getAllApplications() {
        return service.getAllApplications();
    }

    @GetMapping("/user/{userId}")
    public List<LoanApplication> getApplicationsByUserId(@PathVariable int userId) {
        return service.getApplicationsByUserId(userId);
    }

    @PutMapping("/{id}/status")
    public LoanApplication updateApplicationStatus(@PathVariable int id, @RequestParam String status) {
        return service.updateApplicationStatus(id, status);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable int id) {
        service.deleteApplication(id);
    }
}