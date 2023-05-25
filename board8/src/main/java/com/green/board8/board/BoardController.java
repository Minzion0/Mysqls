package com.green.board8.board;

import com.green.board8.board.model.Dto.BoardDelDto;
import com.green.board8.board.model.Dto.BoardInsDto;
import com.green.board8.board.model.Dto.BoardUpdDto;
import com.green.board8.board.model.Vo.BoardDetailVo;
import com.green.board8.board.model.Vo.BoardVo;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/")
public class BoardController {

    private final BoardService service;
    @Autowired
    public BoardController(BoardService service){
        this.service=service;
    }

    @PostMapping
    @Tag(name = "새로 만들기")
    public void boardPost(@RequestBody BoardInsDto dto){
        service.insBoard(dto);
    }
    @GetMapping
    @Tag(name = "전부 보기")
    public List<BoardVo>boardGet(){
        return service.selBoard();
    }
    @GetMapping("/{iboard}")
    @Tag(name = "하나씩 보기")
    public BoardDetailVo boardGetId(@PathVariable int iboard){
        BoardDetailVo vo = new BoardDetailVo();
        vo.setIboard(iboard);
        return service.selBoardId(vo);
    }

    @PutMapping
    @Tag(name = "수정")
    public void boardPut(@RequestBody BoardUpdDto dto){
        service.updBoard(dto);
    }
    @DeleteMapping("/{iboard}")
    @Tag(name = "삭제")
    public void boardDel(@PathVariable int iboard){
        BoardDelDto dto= new BoardDelDto();
        dto.setIboard(iboard);
        service.delBoard(dto);
    }
}
