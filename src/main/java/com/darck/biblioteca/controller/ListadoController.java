package com.darck.biblioteca.controller;

import com.darck.biblioteca.domain.Libro;
import com.darck.biblioteca.service.LibroService;
import java.util.List;
import org.springframework.ui.Model;    
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ListadoController {

    private final LibroService libroService;

    public ListadoController(LibroService libroService) {
        this.libroService = libroService;
    }

    @RequestMapping("/")
    public String listarLibros(Model model) {
        List<Libro> destacados = libroService.buscarDestacados();
        model.addAttribute("ibros", destacados);
        return "listado";
    }
}
