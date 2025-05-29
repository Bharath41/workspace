package com.examly.springapploan.service;

import com.examly.springapploan.model.CollegeApplication;
import java.util.List;

public interface CollegeApplicationService {
    CollegeApplication saveCollegeApplication(CollegeApplication collegeApplication);

    List<CollegeApplication> getAllCollegeApplications();

    CollegeApplication getCollegeApplicationById(int id);

    CollegeApplication updateCollegeApplication(int id, CollegeApplication collegeApplication);

    void deleteCollegeApplication(int id);
}