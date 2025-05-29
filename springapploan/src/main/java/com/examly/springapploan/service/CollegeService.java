package com.examly.springapploan.service;

import com.examly.springapploan.model.College;
import java.util.List;

public interface CollegeService {
    College saveCollege(College college);

    List<College> getAllColleges();

    College getCollegeById(int id);

    College updateCollege(int id, College college);

    void deleteCollege(int id);
}