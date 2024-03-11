package com.jpa.repository;

import com.jpa.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria,Long> {
}
