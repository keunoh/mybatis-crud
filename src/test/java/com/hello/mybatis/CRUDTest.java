package com.hello.mybatis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class CRUDTest {

    @Autowired
    public MemberMapper mapper;

    @Test
    public void testInsert() {
    }

    @Test
    public void testGetAll() {
        List<Member> memberList = mapper.getMemberList();
        for (Member member : memberList) {
            System.out.println("member = " + member);
        }
    }

    @Test
    public void testUpdate() {
        mapper.update();
    }

    @Test
    public void testDelete() {
        mapper.delete();

        List<Member> memberList = mapper.getMemberList();
        for (Member member : memberList) {
            System.out.println("member = " + member);
        }
    }
}
