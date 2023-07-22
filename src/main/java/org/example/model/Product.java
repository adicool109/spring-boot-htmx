package org.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Entity
//@Table(name = "PRODUCT")
public class Product {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    //@Basic(optional = false)
    private String productName;

    private String productDesc;

    private Float price;

    private String pictureUrl;

    // TODO: implement for currency

}
