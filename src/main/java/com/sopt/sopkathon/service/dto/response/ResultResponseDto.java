package com.sopt.sopkathon.service.dto.response;

import com.sopt.sopkathon.domain.Result;

public record ResultResponseDto(
        String imageUrl,
        Boolean isSuccess,
        String title,
        String content
) {
    public static ResultResponseDto of(
            final Result result
    ) {
        return new ResultResponseDto(
                result.getImageUrl(),
                result.getIsSuccess(),
                result.getTitle(),
                result.getContent()
        );
    }
}
