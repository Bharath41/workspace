package com.examly.springappfeedback.controller;

import com.examly.springappfeedback.model.Feedback;
import com.examly.springappfeedback.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/submit")
    public Feedback submitFeedback(@RequestBody Feedback feedback) {
        return feedbackService.saveFeedback(feedback);
    }

    @GetMapping("/all")
    public List<Feedback> getAllFeedback() {
        return feedbackService.getAllFeedback();
    }

    @GetMapping("/{id}")
    public Feedback getFeedbackById(@PathVariable int id) {
        return feedbackService.getFeedbackById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteFeedback(@PathVariable int id) {
        feedbackService.deleteFeedback(id);
    }
}