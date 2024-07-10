package com.example.demo.controllers;

import com.example.demo.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books/new")
public class BookController extends BaseController<Book> {

}