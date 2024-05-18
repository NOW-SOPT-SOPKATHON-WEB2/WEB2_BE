package com.sopt.sopkathon.service;

import com.sopt.sopkathon.service.dto.response.AnswerListResponseDto;

public interface AnswerService {
  AnswerListResponseDto findAnswerList(final Long memberId, final Long questionId);
}
