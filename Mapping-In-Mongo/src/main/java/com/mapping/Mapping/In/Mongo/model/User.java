package com.mapping.Mapping.In.Mongo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "User_Data")
public class User {
    @Id
    private int id;
    private String name;
    private String gender;
    private List<Products> products;
    private Address address;
}
