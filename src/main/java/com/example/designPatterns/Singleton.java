package com.example.designPatterns;

public class Singleton {

    //static variable to cache instance
    private volatile static Singleton INSTANCE = null;

    //make default constructor private
    private Singleton() {

    }

    //static method to return same instance which it creates
    //synchronized will make only one thread access this function at a time
    public static Singleton getInstance() {

        if(INSTANCE == null) {
           synchronized (Singleton.class) {
               if (INSTANCE == null) {
                   System.out.println("Creating singleton instance");
                   INSTANCE = new Singleton();
               }
           }

        }

        return INSTANCE;
    }
}

//the above instantiation is lazy instantiation
//eager instantiation can also be use which will result in thread safety without using synchronize