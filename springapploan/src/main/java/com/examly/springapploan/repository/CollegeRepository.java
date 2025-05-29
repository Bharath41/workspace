package main.java.com.examly.springapploan.repository;

import com.examly.springapploan.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Integer> {

}