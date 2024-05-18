package com.sopt.sopkathon.common;

import com.sopt.sopkathon.common.dto.CommonResponse;
import com.sopt.sopkathon.common.dto.ErrorMessage;
import com.sopt.sopkathon.exceptioon.BusinessException;
import com.sopt.sopkathon.exceptioon.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Objects;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    protected ResponseEntity<CommonResponse> handleNotFoundException(NotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(CommonResponse.error(HttpStatus.NOT_FOUND.value(), e.getErrorMessage().getMessage()));
    }

    /**
     * 500 INTERNAL SERVER ERROR
     */
            @ExceptionHandler(BusinessException.class)
            protected ResponseEntity<CommonResponse> handleInternalServerError(final BusinessException e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(CommonResponse.error(ErrorMessage.INTERNAL_SERVER_ERROR));
            }

            @ExceptionHandler(Exception.class)
            protected ResponseEntity<CommonResponse> handleInternalServerError(final Exception e) {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(CommonResponse.error(ErrorMessage.INTERNAL_SERVER_ERROR));
            }
}
