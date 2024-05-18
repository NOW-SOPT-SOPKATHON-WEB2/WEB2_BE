package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.service.dto.response.AnswerResponseDto;
import com.sopt.sopkathon.service.dto.response.AnswerWeightResponseDto;
import com.sopt.sopkathon.service.dto.response.QuestionCheckResponseDto;
import java.util.List;

public interface AnswerRepositoryCustom {

  List<AnswerResponseDto> findByQuestionId(Long questionId);

  AnswerWeightResponseDto getWeightByAnswerId (Long answerId);

  QuestionCheckResponseDto findQuestionByPageNum(int pageNum);
}
