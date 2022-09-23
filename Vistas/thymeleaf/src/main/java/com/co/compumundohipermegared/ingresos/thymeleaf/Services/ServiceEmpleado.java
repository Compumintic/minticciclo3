package com.co.compumundohipermegared.ingresos.thymeleaf.Services;

import com.co.compumundohipermegared.ingresos.thymeleaf.entity.Employee;

public class ServiceEmpleado {
    Employee employee = new Employee(12L, "leolenis@gmail.com");

    public ServiceEmpleado() {
    }

    public Employee getEmployee() {
        return this.employee;
    }
}