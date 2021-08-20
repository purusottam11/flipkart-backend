package com.purusottam.flipkartbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Product {
    @Id
    private String productId;
    private String productName;
    private String productUrl;
    // Primary key from the Category table
    private Long categoryId;
    private Integer retailPrice;
    private Integer discountPrice;
    private String description;
    private Double averageRating;
    // primary key from the Brand table
    private String brandId;
}
