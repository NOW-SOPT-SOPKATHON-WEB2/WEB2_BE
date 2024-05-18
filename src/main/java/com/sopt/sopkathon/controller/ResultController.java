package com.sopt.sopkathon.controller;

import com.sopt.sopkathon.common.dto.CommonResponse;
import com.sopt.sopkathon.common.dto.SuccessMessage;
import com.sopt.sopkathon.service.ResultService;
import com.sopt.sopkathon.service.dto.response.QuestionCheckResponseDto;
import com.sopt.sopkathon.service.dto.response.ResultResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/result")
public class ResultController {

    private final ResultService resultService;

    @GetMapping("/{situationId}/{weight}")
    public CommonResponse<ResultResponseDto> getQuestion(
            @RequestHeader final Long memberId,
            @PathVariable final Long situationId,
            @PathVariable final int weight
    ) {
        return CommonResponse.success(SuccessMessage.GET_RESULT_SUCCESS, resultService.findResult(memberId, situationId, weight));
    }
}
