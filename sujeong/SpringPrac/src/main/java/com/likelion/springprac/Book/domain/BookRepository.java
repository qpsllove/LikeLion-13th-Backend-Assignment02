package com.likelion.springprac.Book.domain;

import java.util.List;

public interface BookRepository{

    void save(Book book);
    Book FindById(Long id);
    List<Book> findAll();
    void updateById(Long id, Book Book);
    void deleteById(Long id);

}