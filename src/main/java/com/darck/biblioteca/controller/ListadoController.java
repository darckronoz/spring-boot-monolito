package com.darck.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {
    @RequestMapping("/")
    public String listarLibros() {
        return "listado";
    }
}
