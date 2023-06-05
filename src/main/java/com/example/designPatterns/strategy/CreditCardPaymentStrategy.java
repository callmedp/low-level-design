package com.example.designPatterns.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String cardNo;
    private int cvv;

    public CreditCardPaymentStrategy(String cardNo, int cvv) {
        this.cardNo = cardNo;
        this.cvv = cvv;
    }

    public void pay(int amount) {

        System.out.println("paid amount of $ " + amount);
    }
}
