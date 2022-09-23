package com.co.compumundohipermegared.ingresos.thymeleaf.Services;

import com.co.compumundohipermegared.ingresos.thymeleaf.entity.Employee;
import com.co.compumundohipermegared.ingresos.thymeleaf.entity.Enterprise;


public class ServiceEmpresa {
    Enterprise enterprise;
    ServiceEmpleado employee = new ServiceEmpleado();

    public ServiceEmpresa() {
        Employee employee = this.employee.getEmployee();
        this.enterprise = new Enterprise(14L, "Leonardo", "125646", "350644", "Cra 73");
    }

    public Enterprise getEnterprise() {
        return this.enterprise;
    }
}

