package com.examly.springapploan.service;

import com.examly.springapploan.model.College;
import com.examly.springapploan.repository.CollegeRepository;
import com.examly.springapploan.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CollegeServiceImpl implements CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    @Override
    public College saveCollege(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    @Override
    public College getCollegeById(int id) {
        return collegeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("College not found with ID: " + id));
    }

    @Override
    public College updateCollege(int id, College updatedCollege) {
        College college = getCollegeById(id);
        college.setName(updatedCollege.getName());
        college.setAddress(updatedCollege.getAddress());
        college.setContactNumber(updatedCollege.getContactNumber());
        college.setEmail(updatedCollege.getEmail());
        college.setWebsite(updatedCollege.getWebsite());
        college.setCourses(updatedCollege.getCourses());
        college.setStatus(updatedCollege.getStatus());
        return collegeRepository.save(college);
    }

    @Override
    public void deleteCollege(int id) {
        College college = getCollegeById(id);
        collegeRepository.delete(college);
    }
}