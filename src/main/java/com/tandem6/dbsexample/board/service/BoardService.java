package com.tandem6.dbsexample.board.service;

import com.tandem6.dbsexample.board.domain.Board;
import com.tandem6.dbsexample.board.domain.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public List<Board> getContentList() {
        log.info("Hello {}", boardRepository.findAll());
        return boardRepository.findAll();
    }
}
