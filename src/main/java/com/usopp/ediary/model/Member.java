package com.usopp.ediary.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
public class Member {
    private Long id;
    private String userId;
    private String userPw;
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
}
