package com.jpa.persistence;

import com.jpa.entity.Categoria;

import java.util.List;
import java.util.Optional;

public interface ICategoriaDAO {
    List<Categoria> findAll();
    Optional<Categoria> findById(Long id);
    void save(Categoria categoria);
    void deleteById(Long id);
}
