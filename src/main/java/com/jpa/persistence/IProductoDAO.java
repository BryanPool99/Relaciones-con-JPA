package com.jpa.persistence;

import com.jpa.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoDAO {
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    //Metodo para encontrar producto con un rango de precio predefinido
    //List<Producto> findByPriceInRange(Double minPrice,Double maxPrice);
    void save(Producto producto);
    void deleteById(Long id);
}
