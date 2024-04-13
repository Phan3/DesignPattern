package com.phan.creational.builder;

public class StudentBuilder {
    Student student = new Student();

    public StudentBuilder setId(long id) {
        student.id = id;
        return this;
    }

    public StudentBuilder setFirstName(String firstName) {
        student.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        student.lastName = lastName;
        return this;
    }

    public StudentBuilder setAge(int age) {
        student.age = age;
        return this;
    }

    public Student build() {
        return student;
    }
}
