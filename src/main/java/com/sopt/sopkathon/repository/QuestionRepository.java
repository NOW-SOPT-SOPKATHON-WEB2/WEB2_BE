package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {
}
