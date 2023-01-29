package com.example.designPatterns.paymentFactory;

import org.checkerframework.common.returnsreceiver.qual.This;

public class PaymentFactory {

    private UserDetails userDetails;

    public PaymentFactory(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public Payment getPaymentMethod(String cardType) {
        if(cardType == "Credit Card") {

            return new CreditCardPayment(userDetails);
        }
        else if(cardType == "UPI") {

            return new UPIPayment(userDetails);
        }
        else {
            return null;
        }
    }

}
