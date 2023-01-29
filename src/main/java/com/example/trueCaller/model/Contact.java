package com.example.trueCaller.model;

public class Contact {

    private String countryCode;
    private String phone;
    private String email;

    public Contact(String phone) {
        this.phone = phone;
        this.countryCode = "+91";
        this.email = "";
    }

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
        this.countryCode = "+91";
    }

    public Contact(String countryCode, String phone, String email) {
        this.countryCode = countryCode;
        this.phone = phone;
        this.email = email;
    }
}
