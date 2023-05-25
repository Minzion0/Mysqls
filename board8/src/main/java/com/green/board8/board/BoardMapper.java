package com.green.board8.board;

import com.green.board8.board.model.Dto.BoardDelDto;
import com.green.board8.board.model.Dto.BoardInsDto;
import com.green.board8.board.model.Dto.BoardUpdDto;
import com.green.board8.board.model.Vo.BoardDetailVo;
import com.green.board8.board.model.Vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void insBoard(BoardInsDto dto);
    List<BoardVo>selBoard();
    BoardDetailVo selBoardId(BoardDetailVo vo);
    void updBoard(BoardUpdDto dto);
    void delBoard(BoardDelDto dto);

}
