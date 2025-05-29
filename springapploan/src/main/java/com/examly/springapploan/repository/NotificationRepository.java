package main.java.com.examly.springapploan.repository;

import com.examly.springapploan.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

}