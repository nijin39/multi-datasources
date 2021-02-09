package com.tandem6.dbsexample.board.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@Table(name = "BOARD")
public class Board {

    @Id
    private Long idx;
    private String name;
    private String email;
    private String passwd;
}
