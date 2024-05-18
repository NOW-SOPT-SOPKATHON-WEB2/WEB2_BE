package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.domain.Answer;
import com.sopt.sopkathon.domain.Question;
import com.sopt.sopkathon.service.dto.response.QuestionCheckListResponseDto;
import com.sopt.sopkathon.service.dto.response.QuestionCheckResponseDto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface QuestionRepository extends JpaRepository<Question, Long> , AnswerRepositoryCustom {
    Optional<Question> findBySituationIdAndPageNumber(Long situationId, int pageNumber);

}
