package com.example.spring.member;

public class Member {
    private long memberId;
    private String name;
    private Grade grade;

    public Member(long memberId, String name, Grade grade) {
        this.memberId = memberId;
        this.name = name;
        this.grade = grade;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }
}
