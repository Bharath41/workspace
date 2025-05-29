package com.examly.springapploan.service;

import com.examly.springapploan.model.Notification;
import java.util.List;

public interface NotificationService {
    Notification addNotification(Notification notification);

    List<Notification> getAllNotifications();

    Notification getNotificationById(int id);

    void deleteNotification(int id);
}