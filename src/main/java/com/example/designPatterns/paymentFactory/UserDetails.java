package com.example.designPatterns.paymentFactory;

import java.time.LocalDate;
import java.util.Date;

public class UserDetails {

    private String VPA;
    private Integer cardNo;
    private LocalDate expiry;

    public UserDetails(String VPA, Integer cardNo, LocalDate expiry) {
        this.VPA = VPA;
        this.cardNo = cardNo;
        this.expiry = expiry;
    }

    public String getVPA() {
        return VPA;
    }

    public Integer getCardNo() {
        return cardNo;
    }

    public LocalDate getExpiry() {
        return expiry;
    }
}
