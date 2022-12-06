package com.example.springbootrestapicrud.controller;

import com.example.springbootrestapicrud.domain.Book;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/")
public class BookController {
    @PostMapping
    private Book create(@RequestBody Book book) {
        book.setId(1);
        book.setTitle("Kotlin");
        book.setCreatedDate(LocalDate.now());
        book.setModifiedDate(LocalDate.now());
        return book;
    }
}
