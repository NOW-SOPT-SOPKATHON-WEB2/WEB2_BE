package com.sopt.sopkathon.service;

import com.sopt.sopkathon.common.dto.ErrorMessage;
import com.sopt.sopkathon.domain.Question;
import com.sopt.sopkathon.exceptioon.NotFoundException;
import com.sopt.sopkathon.repository.QuestionRepository;
import com.sopt.sopkathon.service.dto.response.QuestionCheckResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class QuestionService {
    private final QuestionRepository questionRepository;

    public Question findQuestionById(
        final Long questionId
    ) {
        return questionRepository.findById(questionId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.QUESTION_NOT_FOUND)
        );
    }

}
