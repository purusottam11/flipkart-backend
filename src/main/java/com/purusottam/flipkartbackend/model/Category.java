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
public class Category {
    @Id
    private String categoryId;
    private String categoryName;
    private String description;
    // Like foot ware is the parent of -> shoes and sleeper
    private String parentId;
}
