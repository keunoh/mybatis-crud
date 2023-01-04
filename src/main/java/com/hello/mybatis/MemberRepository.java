package com.hello.mybatis;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

    private final MemberMapper mapper;

    public void memberSave(Member member) {
        mapper.insert(member);
    }
}
