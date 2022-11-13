package com.Tienda_L.dao;

import com.Tienda_L.domain.Articulo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ArticuloDao extends CrudRepository <Articulo, Long>{
    
    List<Articulo> findByExistencias(int existencias);
    
     List<Articulo> findByExistenciasAndIdCategoria (int existencias, Long idCategoria);
}
