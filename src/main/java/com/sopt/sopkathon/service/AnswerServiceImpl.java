package com.sopt.sopkathon.service;

import com.sopt.sopkathon.repository.AnswerRepository;
import com.sopt.sopkathon.service.dto.response.AnswerListResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService{

  private final AnswerRepository answerRepository;
  private final AnswerRepository answerRepository;

  @Transactional(readOnly = true)
  @Override
  public AnswerListResponseDto findAnswerList(final Long memberId, final Long questionId) {

    answerRepository.findBy();
    return null;
  }
}
