package com.sopt.sopkathon.service;

import com.sopt.sopkathon.common.dto.ErrorMessage;
import com.sopt.sopkathon.domain.Question;
import com.sopt.sopkathon.exceptioon.BusinessException;
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
    private static final int MAX_PAGE_NUMBER = 8;
    private int pageNumber = 1;

    private final QuestionRepository questionRepository;
    private final MemberService memberService;
    private final SituationService situationService;

    public Question findQuestionById(
        final Long questionId
    ) {
        return questionRepository.findById(questionId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.QUESTION_NOT_FOUND)
        );
    }

    public QuestionCheckResponseDto findQuestionCheck(
            final Long memberId,
            final Long situationId
    ) {
        situationService.findSituationById(situationId);

        Question question = questionRepository.findBySituationIdAndPageNumber(situationId, pageNumber).orElseThrow(
                () -> new BusinessException(ErrorMessage.QUESTION_NOT_FOUND)
        );
        pageNumber++;
        if (pageNumber > MAX_PAGE_NUMBER) { pageNumber = 1; }
        return QuestionCheckResponseDto.of(question);
    }
}
