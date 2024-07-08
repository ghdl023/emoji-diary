package com.usopp.ediary;

import com.usopp.ediary.dao.ContentsMapper;
import com.usopp.ediary.model.Contents;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ContentsTests {

    @Autowired
    private ContentsMapper mapper;

    @Test
    void 일기_한건_조회() {
        Contents contents =  mapper.selectContentsById(1L);
        System.out.println(contents);
    }

    @Test
    void 일기_전체_조회() {
        List<Contents> list = mapper.selectAllContents();
        for(Contents contents: list) {
            System.out.println(contents);
        }
    }

    @Test
    void 일기_추가() {
        Contents contents = Contents.builder()
                .title("제목TEST")
                .content("내용TEST")
                .writer(1L)
                .emotionId("HAPPY")
                .weatherId("SUNNY")
                .withsId("SOLO")
                .yyyymmdd("20240708")
                .build();
        mapper.insertContents(contents);
    }

    @Test
    void 일기_수정() {
        Contents contents = Contents.builder()
                .id(1L)
                .title("제목UPDATE")
                .content("내용UPDATE")
                .writer(1L)
                .emotionId("BAD")
                .weatherId("SNOW")
                .withsId("FAMILY")
                .yyyymmdd("20240708")
                .build();
        mapper.updateContents(contents);

        Contents updatedContents = mapper.selectContentsById(1L);
        System.out.println(updatedContents);
    }

    @Test
    void 일기_삭제() {
        mapper.deleteContents(1L);
        Contents contents = mapper.selectContentsById(1L);
        System.out.println(contents);
    }
}
