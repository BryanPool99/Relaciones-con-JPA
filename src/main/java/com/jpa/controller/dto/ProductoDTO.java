package com.jpa.controller.dto;

import com.jpa.entity.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoDTO {
    private Long id;
    private String descripcion;
    private String presentacion;
    private Double costo;
    private Double precio;
    private Integer cantidad;
    private String palabra;
    private String imagen;
    private Boolean estado;
    private Color color;
    private Genero genero;
    private Marca marca;
    private Talla talla;
    private Categoria categoria;
    private Sucursal sucursal;
    private List<Profesional> profesionals;
    private List<Venta> ventas;
}
