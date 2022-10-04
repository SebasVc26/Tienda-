package com.Tienda_L.controler;

import com.Tienda_L.dao.ClienteDao;
import com.Tienda_L.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexControler {
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Ahora se usa arquitectura MVC");
        Cliente cliente = new Cliente("Sebastian", "Vargas Cardenas", "sebas2000_vc@hotmail.com","8722-2863");
        //Cliente cliente2 = new Cliente("Joaquin", "Araya Cruz", "jaraya@hotmail.com","8624-9877");
        //var clientes = Arrays.asList();
        
        var clientes = clienteDao.findAll();
        model.addAttribute("cliente", cliente);
        model.addAttribute("clientes", clientes);
        return "index";
    }
  
}
