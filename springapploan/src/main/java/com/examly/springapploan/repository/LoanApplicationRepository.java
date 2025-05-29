package main.java.com.examly.springapploan.repository;

import com.examly.springapploan.model.LoanApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface LoanApplicationRepository extends JpaRepository<LoanApplication, Integer> {
    List<LoanApplication> findByUserId(int userId);
}