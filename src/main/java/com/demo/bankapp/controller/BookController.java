package com.demo.bankapp.controller;

import com.demo.bankapp.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/books")
public interface BookController {

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks();
}
