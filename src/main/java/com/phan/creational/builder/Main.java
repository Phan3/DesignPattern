package com.phan.creational.builder;

public class Main {
    public static void main(String[] args) {
        Student student = new StudentBuilder()
                .setFirstName("Phan Dao")
                .setLastName("Hong Thi")
                .build();
        System.out.println("Student information: " + student);
    }
}
