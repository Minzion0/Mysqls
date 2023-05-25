package com.green.board8.board.model.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class BoardDetailVo {
    private int iboard;
    private String title;
    private String ctnt;
    private String writer;
    private String createdAt;
    private String updatedAt;
}
