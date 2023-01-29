package com.example.designPatterns.paymentFactory;

public class UPIPayment implements Payment {

    private String VPA;

    public UPIPayment(UserDetails userDetails) {

        this.VPA = userDetails.getVPA();
    }

    @Override
    public void pay(Integer amount) {
        System.out.println("Paid successfully "+ amount +" by id " + VPA);

    }
}
