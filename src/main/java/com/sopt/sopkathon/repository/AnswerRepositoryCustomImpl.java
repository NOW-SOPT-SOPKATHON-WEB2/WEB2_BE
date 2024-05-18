package com.sopt.sopkathon.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;

public class AnswerRepositoryCustomImpl implements AnswerRepositoryCustom{
  private final JPAQueryFactory queryFactory;

  public AnswerRepositoryCustomImpl(EntityManager em) {
    this.queryFactory = new JPAQueryFactory(em);
  }

}
