package com.likelion.springprac.Book.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Book {

    private Long id;    //책 고유 id
    private String title;    //책의 제목
    private String writer;     //책의 작가

    @Builder
    public Book(Long id, String title, String writer) {
        this.id = id;
        this.title = title;
        this.writer = writer;
    }

    public void update(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }
}

