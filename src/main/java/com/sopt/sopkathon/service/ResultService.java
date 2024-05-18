package com.sopt.sopkathon.service;

import com.sopt.sopkathon.common.dto.ErrorMessage;
import com.sopt.sopkathon.domain.Result;
import com.sopt.sopkathon.exceptioon.NotFoundException;
import com.sopt.sopkathon.repository.ResultRepository;
import com.sopt.sopkathon.service.dto.response.ResultResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@Service
@RequiredArgsConstructor
@Transactional
public class ResultService {
    private final ResultRepository resultRepository;

    private Result findResultById(
            final Long resultId
    ) {
        return resultRepository.findById(resultId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.RESULT_NOT_FOUND)
        );
    }

    public ResultResponseDto findResult(
            final Long memberId,
            final Long situationId,
            final int weight
    ) {
        Result result = resultRepository.findByWeightWithinRange(weight, situationId);
        return ResultResponseDto.of(result);
    }
}
