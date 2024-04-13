package com.phan.creational.factory;

public class SharpFactory {

    enum SharpType {
        CIRCLE,
        SQUARE,
        TRIANGLE
    }
    public static Sharp createSharp(SharpType type) {
        Sharp sharp = null;
        switch (type) {
            case CIRCLE -> sharp = new Circle();
            case SQUARE -> sharp = new Square();
            case TRIANGLE -> sharp = new Triangle();
        }
        return sharp;
    }
}
