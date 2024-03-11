package com.jpa.service;


import com.jpa.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaService {
    List<Categoria> findAll();
    Optional<Categoria> findById(Long id);
    void save(Categoria categoria);
    void deleteById(Long id);
}
