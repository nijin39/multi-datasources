package com.tandem6.dbsexample.authors.controller;

import com.tandem6.dbsexample.authors.application.AuthorService;
import com.tandem6.dbsexample.authors.domain.Author;
import com.tandem6.dbsexample.board.domain.Board;
import com.tandem6.dbsexample.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping
    public List<Author> getAuthorList() {
        return authorService.getContentList();
    }

}
