package com.sopt.sopkathon.service;

import com.sopt.sopkathon.common.dto.ErrorMessage;
import com.sopt.sopkathon.domain.Question;
import com.sopt.sopkathon.exceptioon.NotFoundException;
import com.sopt.sopkathon.repository.AnswerRepository;
import com.sopt.sopkathon.repository.QuestionRepository;
import com.sopt.sopkathon.service.dto.response.QuestionCheckListResponseDto;
import com.sopt.sopkathon.service.dto.response.QuestionCheckResponseDto;
import java.util.ArrayList;
import java.util.List;
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
    private final AnswerRepository answerRepository;
    private final MemberService memberService;
    private final SituationService situationService;

    public Question findQuestionById(
        final Long questionId
    ) {
        return questionRepository.findById(questionId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.QUESTION_NOT_FOUND)
        );
    }

    public QuestionCheckListResponseDto findQuestionCheck(
            final Long memberId,
            final Long situationId
    ) {
//        situationService.findSituationById(situationId);

////        Question question = questionRepository.findBySituationIdAndPageNumber(situationId, pageNumber).orElseThrow(
////                () -> new BusinessException(ErrorMessage.QUESTION_NOT_FOUND)
//        );
        List<QuestionCheckResponseDto> q = new ArrayList<>();

        for(int i = 1; i <= pageNumber; i++) {
            QuestionCheckResponseDto questionByQuestionId = answerRepository.findQuestionByPageNum(i);
            q.add(questionByQuestionId);
        }

        pageNumber++;
        if (pageNumber > MAX_PAGE_NUMBER) { pageNumber = 1; }

        return QuestionCheckListResponseDto.of(q);
    }
}
