package com.sopt.sopkathon.controller;

import com.sopt.sopkathon.common.dto.CommonResponse;
import com.sopt.sopkathon.common.dto.SuccessMessage;
import com.sopt.sopkathon.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/answer")
public class AnswerController {

  private final AnswerService answerService;

  @GetMapping("{questionId}")
  public ResponseEntity<CommonResponse> findAnswer(
      @RequestHeader Long memberId,
      @PathVariable(name = "questionId") Long questionId
  ) {
    return ResponseEntity
        .status(HttpStatus.FOUND)
        .body(CommonResponse.success(
            SuccessMessage.ANSWER_FIND_SUCCESS,
            answerService.findAnswerList(memberId, questionId)));
  }
}
