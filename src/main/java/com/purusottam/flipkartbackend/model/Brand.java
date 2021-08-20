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
public class Brand {
    @Id
    private String brandId;
    private String brandName;
    private String description;
    private String websiteUrl;
    private String imageUrl;
    private Long contactNumber;
    @Email
    private String Email;
    private String address;
}
