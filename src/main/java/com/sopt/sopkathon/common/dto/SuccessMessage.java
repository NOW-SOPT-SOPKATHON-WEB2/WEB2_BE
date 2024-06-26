package com.sopt.sopkathon.common.dto;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum SuccessMessage {
    /**
     * 200 OK SUCCESS
     */
    PROCESS_SUCCESS(HttpStatus.OK.value(), "OK"),
    GET_QUESTION_SUCCESS(HttpStatus.OK.value(), "질문 조회를 성공했습니다."),
    GET_RESULT_SUCCESS(HttpStatus.OK.value(), "결과 조회를 성공했습니다."),
    ANSWER_FIND_SUCCESS(HttpStatus.OK.value(), "답변 목록 조회에 성공했습니다."),
    ANSWER_WEIGHT_FIND_SUCCESS(HttpStatus.OK.value(), "답변 가중치 조회에 성공했습니다."),

    ;

    private final int status;
    private final String message;
}
