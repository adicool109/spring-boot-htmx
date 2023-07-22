package org.example.service;

import lombok.extern.slf4j.Slf4j;
import org.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class ProductService {

    public List<Product> getAllProducts(){
        List<Product> products = Arrays.asList(
                new Product(1L, "TV", "TV Desc",2000.00F,"../resources/avatar.png"),
                new Product(2L, "AC", "AC Desc", 3000.00F,"../resources/employee-avatar.png")
        );
        return products;
    }
}
