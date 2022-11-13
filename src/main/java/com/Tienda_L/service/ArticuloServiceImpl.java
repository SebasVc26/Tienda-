package com.Tienda_L.service;

import com.Tienda_L.dao.ArticuloDao;
import com.Tienda_L.domain.Articulo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class ArticuloServiceImpl implements ArticuloService {

    @Autowired
    ArticuloDao articuloDao;
    
    @Override
    public List<Articulo> getArticulos(boolean activos) { //false
        var lista = (List<Articulo>) articuloDao.findAll();
        
        if(activos){
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

    @Override
    public Articulo getArticulo(Articulo articulo) {
        return articuloDao.findById(articulo.getIdArticulo()).orElse(null);
    }

    @Override
    public void save(Articulo articulo) {
        articuloDao.save(articulo);
    }

    @Override
    public void delete(Articulo articulo) {
        articuloDao.delete(articulo);
    }   

    @Override
    public List<Articulo> getPorExistencias(int existencias) {
        return articuloDao.findByExistencias(existencias);
    }

    @Override
    public List<Articulo> getPorExistenciasCateogrias(int existencias, Long idCategoria) {
        return articuloDao.findByExistenciasAndIdCategoria(existencias, idCategoria);
    }
}
