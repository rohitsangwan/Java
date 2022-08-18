package com.mapping.Mapping.In.Mongo.service;

import com.mapping.Mapping.In.Mongo.model.User;
import com.mapping.Mapping.In.Mongo.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private Repository repository;

    public String insertDetails(User user){
        repository.save(user);
        return "User with ID: " + user.getId() + " saved successfully!";
    }

    public List<User> getAll(){
        return repository.findAll();
    }

    public Optional<User> getUserById(int id){
        return repository.findById(id);
    }

    public String deleteUser(int id){
        Optional<User> user = repository.findById(id);
        if(user.isPresent()){
            repository.deleteById(id);
            return "User with ID: " + id + " deleted successfully!";
        }
        return "User not found!";
    }
}
