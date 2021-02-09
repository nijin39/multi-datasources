package com.tandem6.dbsexample.authors.application;

import com.tandem6.dbsexample.authors.domain.Author;
import com.tandem6.dbsexample.authors.domain.AuthorRepository;
import com.tandem6.dbsexample.board.domain.Board;
import com.tandem6.dbsexample.board.domain.BoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getContentList() {
        log.info("Hello {}", authorRepository.findAll());
        return authorRepository.findAll();
    }
}
