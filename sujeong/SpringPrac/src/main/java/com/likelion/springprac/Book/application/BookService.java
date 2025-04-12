package com.likelion.springprac.Book.application;

import com.likelion.springprac.Book.domain.Book;
import com.likelion.springprac.Book.domain.BookRepository;
import com.likelion.springprac.Book.api.dto.BookDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository BookRepository;

    private static Long sequence = 0L;

    public void saveBook(BookDto requestDto) {
        Book book = Book.builder()
                .id(++sequence)
                .title(requestDto.title())
                .writer(requestDto.writer())
                .build();

        BookRepository.save(book);
    }

    public BookDto findBookById(Long id) {
        Book book = BookRepository.FindById(id);
        if (book == null) {
            throw new IllegalArgumentException("해당하는 물건이 없습니다. id = " + id);
        }
        return toDto(book);
    }

    public List<BookDto> findAllBooks() {
        return BookRepository.findAll().stream()
                .map(this::toDto)
                .collect(Collectors.toList());
    }

    public Book updateBookById(Long id, BookDto requestDto) {
        Book book = BookRepository.FindById(id);
        if (book == null) {
            throw new IllegalArgumentException("해당하는 물건이 없습니다. id = " + id);
        }

        book.update(requestDto.title(), requestDto.writer());
        BookRepository.updateById(id, book);
        return book;
    }

    public void deleteBookById(Long id) {
        BookRepository.deleteById(id);
    }

    private BookDto toDto(Book book) {
        return BookDto.builder()
                .id(book.getId())
                .title(book.getTitle())
                .writer(book.getWriter())
                .build();
    }
}
