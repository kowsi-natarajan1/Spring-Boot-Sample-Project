package com.demo.bankapp.controller;

import com.demo.bankapp.model.Book;

import java.util.ArrayList;
import java.util.List;

public class BookControllerImpl implements BookController{
    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>();
    }
}
