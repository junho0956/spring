package com.example.spring.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);

        //then
        Member findMember = memberService.findMember(member.getId());
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
