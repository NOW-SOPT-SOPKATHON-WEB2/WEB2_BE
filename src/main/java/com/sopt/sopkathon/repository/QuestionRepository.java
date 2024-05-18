package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.domain.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> {
    Optional<Question> findBySituationIdAndPageNumber(Long situationId, int pageNumber);
}
