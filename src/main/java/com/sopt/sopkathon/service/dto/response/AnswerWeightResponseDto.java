package com.sopt.sopkathon.service.dto.response;

import com.sopt.sopkathon.domain.Question;

public record AnswerWeightResponseDto(
    int weight,
    String content
) {

  public static AnswerWeightResponseDto of(
      final int weight, final String content
  ) {
    return new AnswerWeightResponseDto(weight, content);
  }
}
