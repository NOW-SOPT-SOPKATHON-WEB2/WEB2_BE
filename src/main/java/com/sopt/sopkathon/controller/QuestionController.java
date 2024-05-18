package com.sopt.sopkathon.controller;

import com.sopt.sopkathon.common.dto.CommonResponse;
import com.sopt.sopkathon.common.dto.SuccessMessage;
import com.sopt.sopkathon.service.QuestionService;
import com.sopt.sopkathon.service.dto.response.QuestionCheckResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/question")
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/{situationId}")
    public CommonResponse<QuestionCheckResponseDto> getQuestion(
            @RequestHeader final Long memberId,
            @PathVariable final Long situationId
    ) {
        return CommonResponse.success(SuccessMessage.GET_QUESTION_SUCCESS, questionService.findQuestionCheck(memberId, situationId));
    }
}
