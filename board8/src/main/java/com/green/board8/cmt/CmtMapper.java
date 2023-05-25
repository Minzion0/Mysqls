package com.green.board8.cmt;

import com.green.board8.cmt.model.CmtInsDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CmtMapper {

    int insCmt(CmtInsDto dto);

}
