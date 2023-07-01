package com.example.board.repository;

import com.example.board.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    Optional<Member> findByPassword(String password);

    List<Member> findAll();
}
