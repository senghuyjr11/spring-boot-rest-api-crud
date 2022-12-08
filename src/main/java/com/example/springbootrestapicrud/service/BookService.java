package com.example.springbootrestapicrud.service;

import org.springframework.http.ResponseEntity;

public interface BookService {
    ResponseEntity<?> addNewBook(String bookRequest);
}
