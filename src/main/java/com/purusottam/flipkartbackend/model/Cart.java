package com.purusottam.flipkartbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Cart {
    @Id
    private String cartId;
    private String customerId;
    private String productId;
    private Integer quantity;
    // Price total Item
    private Integer price;
    private Instant timestamp;
}
