package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
