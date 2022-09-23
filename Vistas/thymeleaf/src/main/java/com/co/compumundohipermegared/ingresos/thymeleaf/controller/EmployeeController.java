package com.co.compumundohipermegared.ingresos.thymeleaf.controller;

import com.co.compumundohipermegared.ingresos.thymeleaf.Repository.IEmpleadoRepository;
import com.co.compumundohipermegared.ingresos.thymeleaf.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class EmployeeController {

    @Autowired
    private IEmpleadoRepository ServiceEmpleado;



    private final Logger LOG = Logger.getLogger(""+EmployeeController.class);

    @GetMapping("/Employee/Lista")
    public String getListEmployee(Model model){
        LOG.log(Level.INFO, "getListEmployee");
        List<Employee> employees = ServiceEmpleado.findAll();
        model.addAttribute("empleados", employees);
        return "Employee/lista";
    }

    @GetMapping("/Employee/crear")
    public String createEmployee(Model modelo){
        LOG.log(Level.INFO, "createEmployee");
        Employee employee = new employee();
        modelo.addAttribute("employee", employee)
        return "Employee/Modificar"
    }
}
