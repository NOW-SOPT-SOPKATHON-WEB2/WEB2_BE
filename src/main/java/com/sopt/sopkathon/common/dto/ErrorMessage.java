package com.sopt.sopkathon.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorMessage {
    /**
     * 400 BAD REQUEST EXCEPTION
     */

    /**
     * 403 FORBIDDEN EXCEPTION
     */

    /**
     * 404 NOT FOUND EXCEPTION
     */
    MEMBER_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "ID에 해당하는 사용자가 존재하지 않습니다."),
    SITUATION_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "ID에 해당하는 상황이 존재하지 않습니다."),

    QUESTION_NOT_FOUND(HttpStatus.NOT_FOUND.value(), "ID에 해당하는 질문이 존재하지 않습니다."),

    /**
     * 500 INTERNAL SERVER ERROR
     */
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), "서버 내부 오류입니다."),
    ;

    private final int status;
    private final String message;
}
