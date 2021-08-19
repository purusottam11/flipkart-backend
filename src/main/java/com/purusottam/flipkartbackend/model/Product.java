package com.purusottam.flipkartbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String productName;
    private String productUrl;
    // Primary key from the Category table
    private Long categoryId;
    private Integer retailPrice;
    private Integer discountPrice;
    private String description;
    private Double averageRating;
    // primary key from the Brand table
    private Long brandId;
}
