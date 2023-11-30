package com.example.spring.member;

import com.example.spring.member.Grade;
import com.example.spring.member.Member;
import com.example.spring.member.MemberRepository;
import com.example.spring.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MemberTest {

    MemberRepository repository = new MemoryMemberRepository();

    @Test
    @DisplayName("가입이 잘 되는지")
    void join() {
        Member member = new Member(1L, "kim-junho", Grade.DEFAULT);
        repository.save(member);

        Assertions.assertThat(member.getName()).isEqualTo(repository.findById(1L).getName());
    }

    @Test
    @DisplayName("멤버를 잘 찾는지 Member findById(long id)")
    void findById() {
        Member member1 = new Member(1L, "kim-junho", Grade.DEFAULT);
        Member member2 = new Member(2L, "jun-hokim", Grade.DEFAULT);
        repository.save(member1);
        repository.save(member2);

        Assertions.assertThat(member2.getMemberId()).isEqualTo(repository.findById(member2.getMemberId()).getMemberId());
    }
}
