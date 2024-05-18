package com.sopt.sopkathon.service.dto.response;

import java.util.List;

public record AnswerListResponseDto(
    List<AnswerResponseDto> answerList
) {
  public static AnswerListResponseDto of(
      List<AnswerResponseDto> answerList
  ) {

    return new AnswerListResponseDto(answerList);
  }
}
