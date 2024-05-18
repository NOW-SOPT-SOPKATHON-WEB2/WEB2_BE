package com.sopt.sopkathon.service;

import com.sopt.sopkathon.repository.AnswerRepository;
import com.sopt.sopkathon.service.dto.response.AnswerListResponseDto;
import com.sopt.sopkathon.service.dto.response.AnswerResponseDto;
import com.sopt.sopkathon.service.dto.response.AnswerWeightResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AnswerServiceImpl implements AnswerService{

  private final AnswerRepository answerRepository;
  private final MemberService memberService;

  @Transactional(readOnly = true)
  @Override
  public AnswerListResponseDto findAnswerList(final Long memberId, final Long questionId) {

    // memberService.findMemberById(memberId);
    return AnswerListResponseDto.of(answerRepository.findByQuestionId(questionId));
  }

  @Transactional(readOnly = true)
  @Override
  public AnswerWeightResponseDto findAnswerWeight(final Long memberId, Long answerId) {
    return answerRepository.getWeightByAnswerId(answerId);
  }
}
