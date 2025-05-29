package com.examly.springapploan.controller;

import com.examly.springapploan.model.College;
import com.examly.springapploan.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/colleges")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping
    public College addCollege(@RequestBody College college) {
        return collegeService.saveCollege(college);
    }

    @GetMapping
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }

    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable int id) {
        return collegeService.getCollegeById(id);
    }

    @PutMapping("/{id}")
    public College updateCollege(@PathVariable int id, @RequestBody College college) {
        return collegeService.updateCollege(id, college);
    }

    @DeleteMapping("/{id}")
    public void deleteCollege(@PathVariable int id) {
        collegeService.deleteCollege(id);
    }
}