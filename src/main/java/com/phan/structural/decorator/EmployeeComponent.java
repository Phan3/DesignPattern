package com.phan.structural.decorator;

import java.util.Date;

public interface EmployeeComponent {

    String getName();
    void doTask();
    void join(Date joinDate);
    void terminate(Date terminateDate);

    default void showBasicInformation() {
        System.out.println("Employee information ===================");
        System.out.println(getName());
    }
}
