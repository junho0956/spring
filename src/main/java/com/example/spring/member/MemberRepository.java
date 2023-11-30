package com.example.spring.member;

public interface MemberRepository {
    Member findById(long id);
    void save(Member member);
}
