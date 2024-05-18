package com.sopt.sopkathon.service;

import com.sopt.sopkathon.service.dto.response.AnswerListResponseDto;
import com.sopt.sopkathon.service.dto.response.AnswerWeightResponseDto;

public interface AnswerService {
  AnswerListResponseDto findAnswerList(final Long memberId, final Long questionId);

  AnswerWeightResponseDto findAnswerWeight(final Long memberId, Long answerId);
}
