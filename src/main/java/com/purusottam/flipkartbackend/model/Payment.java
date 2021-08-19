package com.purusottam.flipkartbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Payment")
public class Payment {
    public enum PaymentType {
        UPI("UPI "), PAYPAL("Paypal"), CREDIT_CARD("Credit Card");
        private String label;

        private PaymentType(String label) {
            this.label = label;
        }

        public String getLabel() {
            return label;
        }
    }

    // This has to come from payment gateway
    @Id
    private Long paymentId;
    private Long customerId;
    private Integer amount;
    private PaymentType paymentType;
    // It's like paypal id or upid etc
    private String paymentUserId;
    private Boolean paymentStatus;
}

