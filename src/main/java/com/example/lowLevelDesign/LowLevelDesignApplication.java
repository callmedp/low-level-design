package com.example.lowLevelDesign;

import com.example.designPatterns.*;
import org.json.JSONException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class LowLevelDesignApplication {

	public static void main(String[] args) {
		System.out.println("Application Started...");
		SpringApplication.run(LowLevelDesignApplication.class, args);
		Singleton car = Singleton.getInstance();
		Singleton bike = Singleton.getInstance();

		System.out.println("car compare bike");
		System.out.println(car);
		System.out.println(bike);

		//************************** Builder Pattern ***********

		Builder url = new Builder.Build().protocol("https://").hostname("google.com").build();

		System.out.println("Builder url");
		System.out.println(url);

		//*********************** Factory Pattern **************

		Factory fac = new Factory();
		fac.clientFactory();

		//********************* Adapter Pattern *****************

		Adapter adapter = new Adapter();
		adapter.clientAdapter();

		//********************* Bridge Pattern *************

		Bridge bridge = new Bridge();
		bridge.createBridge();
	}

}
