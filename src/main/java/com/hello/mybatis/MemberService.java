package com.hello.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public void memberSave(Member member) {
        memberRepository.memberSave(member);
    }
}
