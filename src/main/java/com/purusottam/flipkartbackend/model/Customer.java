package com.purusottam.flipkartbackend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customer")
public class Customer {
    public enum Gender {
        MALE("Male "), FEMALE("Female");
        private String label;

        private Gender(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    private String firstName;
    private String lastName;
    @Email
    private String email;
    private String phoneNumber;
    private String imageUrl;
    private Gender gender;
    private String password;

}
