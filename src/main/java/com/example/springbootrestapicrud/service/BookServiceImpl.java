package com.example.springbootrestapicrud.service;

import com.example.springbootrestapicrud.domain.Book;
import com.example.springbootrestapicrud.domain.BookRepository;
import com.example.springbootrestapicrud.payload.book.BookResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    @Autowired
    void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public ResponseEntity<?> addNewBook(String bookRequest) {
        Book book = Book.builder()
                .title(bookRequest)
                .createdDate(LocalDate.now())
                .modifiedDate(LocalDate.now())
                .build();
        Book bookObj = bookRepository.save(book);
        BookResponse bookResponse = BookResponse.builder()
                .id(bookObj.id)
                .title(bookObj.title)
                .createdDate(bookObj.createdDate)
                .modifiedDate(bookObj.modifiedDate)
                .build();
        return ResponseEntity.ok(bookResponse);
    }
}
