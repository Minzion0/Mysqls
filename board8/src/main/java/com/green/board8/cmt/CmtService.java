package com.green.board8.cmt;

import com.green.board8.cmt.model.CmtInsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CmtService {
    private final CmtMapper mapper;

    @Autowired
    public CmtService(CmtMapper mapper){
        this.mapper=mapper;
    }
    public int insCmt(CmtInsDto dto){
        return mapper.insCmt(dto);
    }
}
