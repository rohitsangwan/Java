package com.mongo.CrudWithMongo.controller;

import com.mongo.CrudWithMongo.model.Book;
import com.mongo.CrudWithMongo.service.Service;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class Controller {
    @Autowired
    private Service service;

    @PostMapping
    public String insertBook(@RequestBody Book book){
        return service.insertBook(book);
    }

    @GetMapping
    public List<Book> findAllBooks(){
        return service.findAllBooks();
    }

    @GetMapping("/{id}")
    public Optional<Book> findBookById(@PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id){
        return service.deleteBook(id);
    }
}
