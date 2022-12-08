package com.example.springbootrestapicrud.controller;

import com.example.springbootrestapicrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {
    private BookService bookService;
    @Autowired
    void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<?> addNewBook(@RequestParam String bookRequest) {
        return bookService.addNewBook(bookRequest);
    }
}
