package com.green.board8.board;

import com.green.board8.board.model.Dto.BoardDelDto;
import com.green.board8.board.model.Dto.BoardInsDto;
import com.green.board8.board.model.Dto.BoardUpdDto;
import com.green.board8.board.model.Vo.BoardDetailVo;
import com.green.board8.board.model.Vo.BoardVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    private final BoardMapper mapper;

    @Autowired
    public BoardService(BoardMapper mapper){
        this.mapper=mapper;
    }
    public void insBoard(BoardInsDto dto){
        mapper.insBoard(dto);
    }
    public void updBoard(BoardUpdDto dto){
        mapper.updBoard(dto);
    }
    public void delBoard(BoardDelDto dto){
        mapper.delBoard(dto);
    }
    public List<BoardVo>selBoard(){
       return mapper.selBoard();
    }
    public BoardDetailVo selBoardId(BoardDetailVo vo){
        return mapper.selBoardId(vo);
    }

}
