package com.jpa.controller;

import com.jpa.controller.dto.ProductoDTO;
import com.jpa.entity.Producto;
import com.jpa.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
public class ProductController {
    @Autowired
    private IProductoService productoService;

    @GetMapping("/find/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
        Optional<Producto> productoOptional=productoService.findById(id);
        if(productoOptional.isPresent()){
            Producto producto=productoOptional.get();
            ProductoDTO productoDTO=ProductoDTO.builder()
                    .id(producto.getId())
                    .descripcion(producto.getDescripcion())
                    .presentacion(producto.getPresentacion())
                    .costo(producto.getCosto())
                    .precio(producto.getPrecio())
                    .cantidad(producto.getCantidad())
                    .palabra(producto.getPalabra())
                    .imagen(producto.getImagen())
                    .estado(producto.getEstado())
                    .color(producto.getColor())
                    .genero(producto.getGenero())
                    .marca(producto.getMarca())
                    .talla(producto.getTalla())
                    .categoria(producto.getCategoria())
                    .sucursal(producto.getSucursal())
                    .profesionals(producto.getProfesionals())
                    .ventas(producto.getVentas())
                    .build();
            return ResponseEntity.ok(productoDTO);
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/findAll")
    public ResponseEntity<?> findAll(){
        List<ProductoDTO> productoDTOList= productoService.findAll()
                .stream()
                .map(producto -> ProductoDTO.builder()
                        .id(producto.getId())
                        .descripcion(producto.getDescripcion())
                        .presentacion(producto.getPresentacion())
                        .costo(producto.getCosto())
                        .precio(producto.getPrecio())
                        .cantidad(producto.getCantidad())
                        .palabra(producto.getPalabra())
                        .imagen(producto.getImagen())
                        .estado(producto.getEstado())
                        .color(producto.getColor())
                        .genero(producto.getGenero())
                        .marca(producto.getMarca())
                        .talla(producto.getTalla())
                        .categoria(producto.getCategoria())
                        .sucursal(producto.getSucursal())
                        .profesionals(producto.getProfesionals())
                        .ventas(producto.getVentas())
                        .build()).toList();
        return ResponseEntity.ok(productoDTOList);
    }
}
