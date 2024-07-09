package com.usopp.ediary.service;

import com.usopp.ediary.dao.ContentsMapper;
import com.usopp.ediary.model.Contents;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContentsService {

    private final ContentsMapper contentsMapper;

    public Contents selectContentsById(Long id) {
        return contentsMapper.selectContentsById(id);
    }

    public List<Contents> selectAllContents() {
        return contentsMapper.selectAllContents();
    }

    public void insertContents(Contents contents) {
        contentsMapper.insertContents(contents);
    }

    public void updateContents(Contents contents) {
        contentsMapper.updateContents(contents);
    }

    public void deleteContents(Long id) {
        contentsMapper.deleteContents(id);
    }

}
