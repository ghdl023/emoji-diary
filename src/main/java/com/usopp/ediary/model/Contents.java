package com.usopp.ediary.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Contents {
    private Long id;
    private String title;
    private String content;
    private Long writer;
    private String emotionId;
    private String weatherId;
    private String withsId;
    private String yyyymmdd;
}
