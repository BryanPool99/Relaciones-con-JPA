package com.jpa.service.impl;

import com.jpa.entity.Categoria;
import com.jpa.persistence.ICategoriaDAO;
import com.jpa.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CategoriaServiceImpl implements ICategoriaService {
    @Autowired
    private ICategoriaDAO categoriaDAO;
    @Override
    public List<Categoria> findAll() {
        return categoriaDAO.findAll();
    }

    @Override
    public Optional<Categoria> findById(Long id) {
        return categoriaDAO.findById(id);
    }

    @Override
    public void save(Categoria categoria) {
        categoriaDAO.save(categoria);
    }

    @Override
    public void deleteById(Long id) {
        categoriaDAO.deleteById(id);
    }
}
