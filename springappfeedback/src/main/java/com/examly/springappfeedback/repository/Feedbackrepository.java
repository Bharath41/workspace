package com.examly.springappfeedback.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examly.springappfeedback.model.Feedback;

public interface Feedbackrepository extends JpaRepository<Feedback, Integer> {

}