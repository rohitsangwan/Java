package com.mapping.Mapping.In.Mongo.controller;

import com.mapping.Mapping.In.Mongo.model.User;
import com.mapping.Mapping.In.Mongo.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.nio.file.OpenOption;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orderDetails")
public class Controller {
    @Autowired
    private Service service;

    @PostMapping
    public String insertUserDetails(@RequestBody User user){
        return service.insertDetails(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable int id){
        return service.getUserById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id){
        return service.deleteUser(id);
    }
}
