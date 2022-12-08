package com.example.springbootrestapicrud.payload.book;

import lombok.AllArgsConstructor;
import lombok.Builder;

import java.time.LocalDate;
@AllArgsConstructor
@Builder
public class BookResponse {
    public Integer id;
    public String title;
    public LocalDate createdDate;
    public LocalDate modifiedDate;
}
