package com.mapping.Mapping.In.Mongo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Products {
    private int productId;
    private String nameOfProduct;
    private int quantity;
}
