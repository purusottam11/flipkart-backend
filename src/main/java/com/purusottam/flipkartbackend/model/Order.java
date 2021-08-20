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
public class Order {
    @Id
    private String orderId;
    // For reference of the payment
    private Long paymentId;
    private Long customerId;
    private Long productId;
    private Integer price;
    private Integer quantity;
    // Cash on Delivery or paid
    private Boolean paymentStatus;
    private Boolean deliveryStatus;

}
