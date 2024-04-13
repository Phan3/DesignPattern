package com.phan.creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton num1 = Singleton.getInstance();
        Singleton num2 = Singleton.getInstance();
        Singleton num3 = Singleton.getInstance();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
