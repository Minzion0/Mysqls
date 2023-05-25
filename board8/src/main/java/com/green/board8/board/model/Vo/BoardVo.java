package com.green.board8.board.model.Vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BoardVo { // select 할때 사용?
    private int iboard;
    private String title;
    private String writer;
    private String createdAt;
}
