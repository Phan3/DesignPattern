package com.phan.creational.factory;

public class Test {
    public static void main(String[] args) {
        Sharp circle = SharpFactory.createSharp(SharpFactory.SharpType.CIRCLE);
        circle.draw();
    }
}
