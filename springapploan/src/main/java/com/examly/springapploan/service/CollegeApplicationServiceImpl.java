package com.examly.springapploan.service;

import com.examly.springapploan.exception.ResourceNotFoundException;
import com.examly.springapploan.model.CollegeApplication;
import com.examly.springapploan.repository.CollegeApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeApplicationServiceImpl implements CollegeApplicationService {

    @Autowired
    private CollegeApplicationRepository repository;

    @Override
    public CollegeApplication saveCollegeApplication(CollegeApplication collegeApplication) {
        return repository.save(collegeApplication);
    }

    @Override
    public List<CollegeApplication> getAllCollegeApplications() {
        return repository.findAll();
    }

    @Override
    public CollegeApplication getCollegeApplicationById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("CollegeApplication not found with id: " + id));
    }

    @Override
    public CollegeApplication updateCollegeApplication(int id, CollegeApplication collegeApplication) {
        CollegeApplication existing = getCollegeApplicationById(id);
        existing.setApplicationDate(collegeApplication.getApplicationDate());
        existing.setReasonForApplication(collegeApplication.getReasonForApplication());
        existing.setMarkSheet12th(collegeApplication.getMarkSheet12th());
        existing.setPercentage12th(collegeApplication.getPercentage12th());
        existing.setSchool12th(collegeApplication.getSchool12th());
        existing.setStatus(collegeApplication.getStatus());
        existing.setUser(collegeApplication.getUser());
        existing.setCollege(collegeApplication.getCollege());
        return repository.save(existing);
    }

    @Override
    public void deleteCollegeApplication(int id) {
        repository.deleteById(id);
    }
}