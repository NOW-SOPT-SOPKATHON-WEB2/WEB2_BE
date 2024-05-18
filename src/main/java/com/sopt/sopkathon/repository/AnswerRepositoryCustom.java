package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.domain.Answer;
import com.sopt.sopkathon.service.dto.response.AnswerResponseDto;
import java.util.List;

public interface AnswerRepositoryCustom {

  List<AnswerResponseDto> findByQuestionId(Long questionId);
}
