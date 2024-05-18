package com.sopt.sopkathon.repository;

import com.sopt.sopkathon.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
