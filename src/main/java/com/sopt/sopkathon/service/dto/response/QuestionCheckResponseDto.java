package com.sopt.sopkathon.service.dto.response;

import com.sopt.sopkathon.domain.Question;

public record QuestionCheckResponseDto(
        String content,
        int pageNumber,
        Long questionId
) {
    public static QuestionCheckResponseDto of(
            final Question question
    ) {
        return new QuestionCheckResponseDto(
                question.getContent(),
                question.getPageNumber(),
                question.getId()
        );
    }
}
