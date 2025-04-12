package com.likelion.springprac.Book.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class MemoryvBookRepository implements BookRepository {

    private static Map<Long, Book> database = new HashMap<>();

    @Override
    public void save(Book book) {
        database.put(book.getId(), book);

    }

    @Override
    public Book FindById(Long id) {
        return database.get(id);
    }

    @Override
    public List<Book> findAll() {
        return database.values().stream().toList();
    }

    @Override
    public void updateById(Long id, Book Book) {
        database.put(id, Book);

    }

    @Override
    public void deleteById(Long id) {
        database.remove(id);

    }
}








