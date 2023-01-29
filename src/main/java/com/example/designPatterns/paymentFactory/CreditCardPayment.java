package com.example.designPatterns.paymentFactory;


import java.time.LocalDate;


public class CreditCardPayment implements Payment {

    private final Integer cardNo;
    private final LocalDate expiry;


    public CreditCardPayment(UserDetails userDetails) {

        this.cardNo = userDetails.getCardNo();
        this.expiry = userDetails.getExpiry();
    }

    public void pay(Integer amount) {
        System.out.println("Amount Paid Successfully");
        System.out.println(amount);
    }
}
