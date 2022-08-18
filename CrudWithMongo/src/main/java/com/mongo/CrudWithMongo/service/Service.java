package com.mongo.CrudWithMongo.service;

import com.mongo.CrudWithMongo.model.Book;
import com.mongo.CrudWithMongo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    public String insertBook(Book book){
        repository.save(book);
        return "Book saved with ID: " + book.getId();
    }

    public List<Book> findAllBooks(){
        return repository.findAll();
    }

    public Optional<Book> findById(int id){
        return repository.findById(id);
    }

    public String deleteBook(int id){
        Optional<Book> book = repository.findById(id);
        if(book.isPresent()){
            repository.deleteById(id);
            return "Book deleted with ID: " + id;
        }
        return "Book not found";
    }

}
