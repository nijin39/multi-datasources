package com.tandem6.dbsexample.authors.domain;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@ToString
@Table(name = "authors")
public class Author {
    @Id
    private Long id;
    private String name;
    private String email;
}
