package com.phan.creational.Singleton;

import java.util.Random;

public class Singleton {

    private static final Singleton instance = new Singleton();
    private void Singleton(){};

    public static Singleton getInstance() {
        return instance;
    }
}
