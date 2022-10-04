package com.Tienda_L.dao;

import com.Tienda_L.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


public interface ClienteDao extends CrudRepository <Cliente, Long> {
    
}
