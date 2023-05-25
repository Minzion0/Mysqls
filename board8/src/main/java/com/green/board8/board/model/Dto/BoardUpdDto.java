package com.green.board8.board.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardUpdDto {
    private int iboard;
    private String title;
    private String ctnt;
    private String writer;
    private String updatedAt;
}
