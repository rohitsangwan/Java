package com.mongo.CrudWithMongo.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "Books")
public class Book {
    @Id
    private int id;
    private String bookName;
    private String authorName;
}
