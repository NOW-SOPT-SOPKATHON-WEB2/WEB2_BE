package com.sopt.sopkathon.service.dto.response;

import com.sopt.sopkathon.domain.Question;
import java.util.List;

public record QuestionCheckListResponseDto(
    List<QuestionCheckResponseDto> questionList

) {
  public static QuestionCheckListResponseDto of(
      final List<QuestionCheckResponseDto> questionCheckResponseDtoList
  ) {
    return new QuestionCheckListResponseDto(
        questionCheckResponseDtoList
    );
  }
}
