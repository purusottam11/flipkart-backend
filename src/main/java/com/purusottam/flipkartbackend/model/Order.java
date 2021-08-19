package com.purusottam.flipkartbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "OrderTB")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
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
