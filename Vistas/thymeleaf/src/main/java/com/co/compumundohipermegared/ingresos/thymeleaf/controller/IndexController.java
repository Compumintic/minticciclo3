package com.co.compumundohipermegared.ingresos.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class IndexController {

    private final Logger LOG = Logger.getLogger(""+IndexController.class)

     @GetMapping("/")
    public String index(Model model){
        LOG.log(Level.INFO, "index");
        var mensaje = "Bienvenidos al Sistema de Ingresos y Egresos";
        model.addAttribute("mensaje", mensaje);
        return "index";
     }
}
