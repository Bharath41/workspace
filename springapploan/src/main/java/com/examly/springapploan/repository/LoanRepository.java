package main.java.com.examly.springapploan.repository;

import com.examly.springapploan.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

}