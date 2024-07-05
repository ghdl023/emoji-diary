package com.usopp.ediary;

import com.usopp.ediary.dao.MemberMapper;
import com.usopp.ediary.model.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MemberTests {

    @Autowired
    MemberMapper mapper;

    @Test
    public void 멤버_한명_조회() {
        Member member = mapper.selectMemberById(1L);
        System.out.println(member);
    }

    @Test
    public void 멤버_전체_조회() {
        List<Member> members = mapper.selectAllMembers();
        for(Member member: members) {
            System.out.println(member);
        }
    }

    @Test
    public void 멤버_추가() {
        Member member = Member.builder()
                .userId("test")
                .userPw("1234")
                .build();

        mapper.insertMember(member);
    }

}
