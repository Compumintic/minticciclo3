package com.co.compumundohipermegared.ingresos.thymeleaf.Repository;

import com.co.compumundohipermegared.ingresos.thymeleaf.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface IEmpleadoRepository extends CrudRepository<Employee, Long> {
}
