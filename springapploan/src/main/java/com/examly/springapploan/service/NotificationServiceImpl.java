package com.examly.springapploan.service;

import com.examly.springapploan.model.Notification;
import com.examly.springapploan.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationServiceImpl implements NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    @Override
    public Notification addNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    @Override
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    @Override
    public Notification getNotificationById(int id) {
        return notificationRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteNotification(int id) {
        notificationRepository.deleteById(id);
    }
}