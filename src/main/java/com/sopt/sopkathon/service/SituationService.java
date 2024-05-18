package com.sopt.sopkathon.service;

import com.sopt.sopkathon.common.dto.ErrorMessage;
import com.sopt.sopkathon.domain.Question;
import com.sopt.sopkathon.domain.Situation;
import com.sopt.sopkathon.exceptioon.NotFoundException;
import com.sopt.sopkathon.repository.QuestionRepository;
import com.sopt.sopkathon.repository.SituationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class SituationService {
    private final SituationRepository situationRepository;

    public Situation findSituationById(
            final Long situationId
    ) {
        return situationRepository.findById(situationId).orElseThrow(
                () -> new NotFoundException(ErrorMessage.SITUATION_NOT_FOUND)
        );
    }

}
