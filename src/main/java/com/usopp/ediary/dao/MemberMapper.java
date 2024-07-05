package com.usopp.ediary.dao;

import com.usopp.ediary.model.Member;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {
    Member selectMemberById(Long id);
    List<Member> selectAllMembers();
    void insertMember(Member member);
}
