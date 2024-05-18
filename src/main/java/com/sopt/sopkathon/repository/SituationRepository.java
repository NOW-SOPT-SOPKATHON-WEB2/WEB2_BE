package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.domain.Situation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SituationRepository extends JpaRepository<Situation, Long> {
}
