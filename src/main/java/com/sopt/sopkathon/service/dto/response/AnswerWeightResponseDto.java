package com.sopt.sopkathon.service.dto.response;

import com.sopt.sopkathon.domain.Question;

public record AnswerWeightResponseDto(
    int weight
) {

  public static AnswerWeightResponseDto of(
      final int weight
  ) {
    return new AnswerWeightResponseDto(weight);
  }
}
