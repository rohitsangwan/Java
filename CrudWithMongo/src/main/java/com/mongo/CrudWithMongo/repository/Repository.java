package com.mongo.CrudWithMongo.repository;

import com.mongo.CrudWithMongo.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<Book, Integer> {
}
