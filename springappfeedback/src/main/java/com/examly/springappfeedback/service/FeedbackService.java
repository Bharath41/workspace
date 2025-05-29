package com.examly.springappfeedback.service;

import com.examly.springappfeedback.model.Feedback;
import java.util.List;

public interface FeedbackService {
    Feedback saveFeedback(Feedback feedback);

    List<Feedback> getAllFeedback();

    Feedback getFeedbackById(int id);

    void deleteFeedback(int id);
}