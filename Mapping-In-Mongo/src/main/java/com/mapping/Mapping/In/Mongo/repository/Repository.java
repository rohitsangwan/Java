package com.mapping.Mapping.In.Mongo.repository;

import com.mapping.Mapping.In.Mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

@org.springframework.stereotype.Repository
public interface Repository extends MongoRepository<User, Integer> {
}
