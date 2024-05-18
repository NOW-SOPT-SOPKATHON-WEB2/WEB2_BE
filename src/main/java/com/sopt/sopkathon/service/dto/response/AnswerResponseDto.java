package com.sopt.sopkathon.service.dto.response;

import com.sopt.sopkathon.domain.Answer;
import java.util.List;

public record AnswerResponseDto(
    Long answerId,
    String content
) {
  public static AnswerResponseDto of(
      Answer answer
  ) {
    return new AnswerResponseDto(answer.getId(), answer.getContent());
  }
}
