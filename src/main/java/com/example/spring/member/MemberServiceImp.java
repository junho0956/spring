package com.example.spring.member;

public class MemberServiceImp implements MemberService{
    MemberRepository repository = new MemoryMemberRepository();
    @Override
    public void join(Member member) {
        repository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return repository.findById(memberId);
    }
}
