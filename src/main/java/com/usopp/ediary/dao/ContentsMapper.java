package com.usopp.ediary.dao;

import com.usopp.ediary.model.Contents;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContentsMapper {
    Contents selectContentsById(Long id);

    List<Contents> selectAllContents();

    void insertContents(Contents contents);

    void updateContents(Contents contents);

    void deleteContents(Long id);
}
