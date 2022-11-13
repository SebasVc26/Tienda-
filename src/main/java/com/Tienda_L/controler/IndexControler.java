package com.Tienda_L.controler;

import com.Tienda_L.domain.Articulo;
import com.Tienda_L.service.ArticuloService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
public class IndexControler {
    @Autowired
    private ArticuloService articuloService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");
        //var articulos = articuloService.getArticulos(true);
        //var articulos = articuloService.getPorExistencias(5);   
        var articulos = articuloService.getPorExistenciasCateogrias(5, new Long (1));   
        model.addAttribute("articulos", articulos);
        return "index";
    }  
}   
