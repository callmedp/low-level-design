package com.example.designPatterns;

import com.example.designPatterns.paymentFactory.Payment;
import com.example.designPatterns.paymentFactory.PaymentFactory;
import com.example.designPatterns.paymentFactory.UserDetails;

import java.time.LocalDate;


//this is the client code representing factory
public class Factory {

    public void clientFactory() {

        UserDetails dp = new UserDetails("divyanshu@vpa", 7367, LocalDate.of(2023, 11, 21));
        PaymentFactory paymentFactory = new PaymentFactory(dp);
        Payment UPIPaymentMethod = paymentFactory.getPaymentMethod("UPI");
        Payment CreditCardPaymentMethod = paymentFactory.getPaymentMethod("Credit Card");
        UPIPaymentMethod.pay(500);
        CreditCardPaymentMethod.pay(400);
    }
}
