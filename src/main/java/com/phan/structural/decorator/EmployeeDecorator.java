package com.phan.structural.decorator;

import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public abstract class EmployeeDecorator implements EmployeeComponent{
    protected EmployeeComponent employee;

    @Override
    public String getName() {
        return employee.getName();
    }

    @Override
    public void join(Date joinDate) {
        employee.join(joinDate);
    }

    @Override
    public void terminate(Date terminateDate) {
        employee.terminate(terminateDate);
    }


}
