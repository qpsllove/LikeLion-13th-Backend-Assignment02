package com.likelion.springprac.Book.api;

import com.likelion.springprac.Book.api.dto.BookDto;
import com.likelion.springprac.Book.application.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("books")
    public void save(@RequestBody BookDto bookDto) {
        bookService.saveBook(bookDto);
    }

    @GetMapping("books/{id}")
    public BookDto findById(@PathVariable Long id) {
        return bookService.findBookById(id);
    }
    @GetMapping("books")
    public List<BookDto> findAllBook() {
        return bookService.findAllBooks();
    }
    @PatchMapping("books/{id}")
    public void updateBookById(@PathVariable Long id, @RequestBody BookDto bookDto) {
        bookService.updateBookById(id, bookDto);
    }
    @DeleteMapping("books/{id}")
    public void deleteBookById(@PathVariable Long id) {
        bookService.deleteBookById(id);
    }
}
