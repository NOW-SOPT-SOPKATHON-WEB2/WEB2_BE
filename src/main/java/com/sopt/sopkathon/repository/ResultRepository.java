package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.domain.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ResultRepository extends JpaRepository<Result, Long> {
    @Query("SELECT r FROM Result r WHERE r.minWeight <= :weight AND r.maxWeight > :weight AND r.situation.id = :situationId")
    Result findByWeightWithinRange(@Param("weight") int weight, @Param("situationId") Long situationId);
}
