package com.examly.springapploan.controller;

import com.examly.springapploan.model.CollegeApplication;
import com.examly.springapploan.service.CollegeApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/collegeApplications")
@CrossOrigin(origins = "*")
public class CollegeApplicationController {

    @Autowired
    private CollegeApplicationService service;

    @PostMapping("/add")
    public CollegeApplication addCollegeApplication(@RequestBody CollegeApplication application) {
        return service.saveCollegeApplication(application);
    }

    @GetMapping("/all")
    public List<CollegeApplication> getAllCollegeApplications() {
        return service.getAllCollegeApplications();
    }

    @GetMapping("/{id}")
    public CollegeApplication getCollegeApplicationById(@PathVariable int id) {
        return service.getCollegeApplicationById(id);
    }

    @PutMapping("/update/{id}")
    public CollegeApplication updateCollegeApplication(@PathVariable int id,
            @RequestBody CollegeApplication application) {
        return service.updateCollegeApplication(id, application);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCollegeApplication(@PathVariable int id) {
        service.deleteCollegeApplication(id);
    }
}