package com.example.spring.member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{
    private static Map<Long, Member> repository = new HashMap<>();
    @Override
    public Member findById(long id) {
        return repository.get(id);
    }

    @Override
    public void save(Member member) {
        repository.put(member.getMemberId(), member);
    }
}
