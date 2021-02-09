package com.tandem6.dbsexample.board.controller;

import com.tandem6.dbsexample.board.service.BoardService;
import com.tandem6.dbsexample.board.domain.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/contents")
    public List<Board> getContentList() {
        return boardService.getContentList();
    }

}
