package com.purusottam.flipkartbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Seller {

    @Id
    private String sellerId;
    private String sellerName;
    @Email
    private String email;
    private String phoneNumber;
    private String imageUrl;
    private String password;
    private String state;
    private String city;
    private String address;
    private Integer pinCode;
    // Optional
    private String website;

}
