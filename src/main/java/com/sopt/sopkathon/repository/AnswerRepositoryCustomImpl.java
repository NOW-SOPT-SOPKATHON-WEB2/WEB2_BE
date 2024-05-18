package com.sopt.sopkathon.repository;

import static com.sopt.sopkathon.domain.QAnswer.answer;

import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sopt.sopkathon.domain.Answer;
import com.sopt.sopkathon.domain.QAnswer;
import com.sopt.sopkathon.service.dto.response.AnswerResponseDto;
import com.sopt.sopkathon.service.dto.response.AnswerWeightResponseDto;
import jakarta.persistence.EntityManager;
import java.util.List;

public class AnswerRepositoryCustomImpl implements AnswerRepositoryCustom{
  private final JPAQueryFactory queryFactory;

  public AnswerRepositoryCustomImpl(EntityManager em) {
    this.queryFactory = new JPAQueryFactory(em);
  }


  @Override
  public List<AnswerResponseDto> findByQuestionId(Long questionId) {
    return queryFactory.
        select(Projections.constructor(AnswerResponseDto.class,
            answer.id.as("answerId"),
            answer.content
        )).from(answer)
        .where(answer.question.id.eq(questionId)).fetch();
  }

  @Override
  public AnswerWeightResponseDto getWeightByAnswerId(Long answerId) {
    return queryFactory.
        select(Projections.constructor(AnswerWeightResponseDto.class,
            answer.weight
        )).from(answer)
        .where(answer.id.eq(answerId)).fetchOne();
  }
}
