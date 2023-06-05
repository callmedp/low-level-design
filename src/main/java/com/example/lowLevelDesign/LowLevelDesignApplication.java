package com.example.lowLevelDesign;

import com.example.designPatterns.*;
import com.example.designPatterns.bridge.Square;
import com.example.designPatterns.paymentFactory.Payment;
import com.example.designPatterns.strategy.CreditCardPaymentStrategy;
import com.example.designPatterns.strategy.PaymentContext;
import com.example.designPatterns.strategy.PaymentStrategy;
import com.example.designPatterns.strategy.UPIPaymentStrategy;
import com.example.parkingLot.controller.ParkingContoller;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.awt.*;
import java.io.IOException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.parkingLot"})
public class LowLevelDesignApplication {

	public static void main(String[] args) {
		System.out.println("Application Started...");
		ApplicationContext context = SpringApplication.run(LowLevelDesignApplication.class, args);
		ParkingContoller parking = context.getBean(ParkingContoller.class);
		parking.spawnParking();
		parking.generateTicket();
		parking.payment();
//		solid();
//		strategyDP();

//		Singleton car = Singleton.getInstance();
//		Singleton bike = Singleton.getInstance();
//
//		System.out.println("car compare bike");
//		System.out.println(car);
//		System.out.println(bike);
//
//		//************************** Builder Pattern ***********
//
//		Builder url = new Builder.Build().protocol("https://").hostname("google.com").build();
//
//		System.out.println("Builder url");
//		System.out.println(url);
//
//		//*********************** Factory Pattern **************
//
//		Factory fac = new Factory();
//		fac.clientFactory();
//
//		//********************* Adapter Pattern *****************
//
//		Adapter adapter = new Adapter();
//		adapter.clientAdapter();
//
//		//********************* Bridge Pattern *************
//
//		Bridge bridge = new Bridge();
//		bridge.createBridge();
	}

	public static void solid() {

		com.example.designPatterns.solid.Liskov.Rectangle rectangle = new com.example.designPatterns.solid.Liskov.Rectangle();
		rectangle.setWidth(5);
		rectangle.setHeight(10);
		System.out.println("Rectangle area: " + rectangle.calculateArea());

		com.example.designPatterns.solid.Liskov.Square square = new com.example.designPatterns.solid.Liskov.Square();
		square.setWidth(5);
		square.setHeight(10); // Violates LSP by changing height separately
		System.out.println("Square area: " + square.calculateArea());
	}

	public static void strategyDP() {

		PaymentStrategy strategy = new UPIPaymentStrategy("dp@py");
		PaymentStrategy strategy1 = new CreditCardPaymentStrategy("811728333675", 873);
		PaymentContext ctx = new PaymentContext(strategy);
		ctx.setStrategy(strategy1);
		ctx.proceedPayment(1221);
	}

}
