package com.green.board8.board.model.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
public class BoardInsDto {
     private String title;
    private String ctnt;
    private String writer;

}
