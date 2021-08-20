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
public class Address {
    @Id
    private String addressId;
    private String address1;
    private Integer pinCode;
    private String state;
    private String city;
    // Optional
    private String landmark;
    private String customerId;
}
