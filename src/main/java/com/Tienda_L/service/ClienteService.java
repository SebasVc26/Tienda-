package com.Tienda_L.service;

import java.util.List;
import com.Tienda_L.domain.Cliente;

public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
}
