package com.jpa.controller;

import com.jpa.controller.dto.CategoriaDTO;
import com.jpa.entity.Categoria;
import com.jpa.service.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    @Autowired
    private ICategoriaService categoriaService;
    //obtener una categoria por id
    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Categoria> categoriaOptional=categoriaService.findById(id);
        if(categoriaOptional.isPresent()){
            Categoria categoria=categoriaOptional.get();
            CategoriaDTO categoriaDTO=CategoriaDTO.builder()
                    .id(categoria.getId())
                    .descripcion(categoria.getDescripcion())
                    .tienda(categoria.getTienda())
                    .delivery(categoria.getDelivery())
                    .temporada(categoria.getTemporada())
                    .estado(categoria.getEstado())
                    .build();
            return ResponseEntity.ok(categoriaDTO);
        }
        return ResponseEntity.notFound().build();
    }
    //obtener todas las categorias
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<CategoriaDTO> categoriaDTOList= categoriaService.findAll()
                .stream()
                .map(categoria -> CategoriaDTO.builder()
                        .id(categoria.getId())
                        .descripcion(categoria.getDescripcion())
                        .tienda(categoria.getTienda())
                        .delivery(categoria.getDelivery())
                        .temporada(categoria.getTemporada())
                        .estado(categoria.getEstado())
                        .build()).toList();
        return ResponseEntity.ok(categoriaDTOList);
    }
    //agregar una categoria
    @PostMapping("/save")
    public ResponseEntity<?> saveCategoria(@RequestBody CategoriaDTO categoriaDTO) throws URISyntaxException{
        if(categoriaDTO.getDescripcion().isBlank()){
            return ResponseEntity.badRequest().build();
        }
        categoriaService.save(Categoria.builder()
                        .descripcion(categoriaDTO.getDescripcion())
                        .tienda(categoriaDTO.getTienda())
                        .delivery(categoriaDTO.getDelivery())
                        .temporada(categoriaDTO.getTemporada())
                        .estado(categoriaDTO.getEstado())
                        .build());
        return ResponseEntity.created(new URI("/api/categoria/save")).build();
    }
    //actualizar una categoria
    @PutMapping("/update/{id}")
    public ResponseEntity<?> updateCategoria(@PathVariable Long id,@RequestBody CategoriaDTO categoriaDTO){
        Optional<Categoria> categoriaOptional=categoriaService.findById(id);
        if(categoriaOptional.isPresent()){
            Categoria categoria=categoriaOptional.get();
            categoria.setDescripcion(categoriaDTO.getDescripcion());
            categoria.setTienda(categoriaDTO.getTienda());
            categoria.setDelivery(categoriaDTO.getDelivery());
            categoria.setTemporada(categoriaDTO.getTemporada());
            categoria.setEstado(categoriaDTO.getEstado());
            categoriaService.save(categoria);
            return ResponseEntity.ok("Actualziacion de categoria exitoso");
        }
        return ResponseEntity.notFound().build();
    }
    //eliminar una categoria
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id){
        if(id!=null){
            categoriaService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.badRequest().body("El parametro id se encuentra vacio");
    }
}
