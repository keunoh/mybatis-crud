package com.hello.mybatis;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    List<Member> getMemberList();
    void insert(Member member);

    void update();

    void delete();
}
