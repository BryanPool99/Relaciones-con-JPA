package com.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Detalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Venta.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Venta venta;
    @ManyToOne(targetEntity = Producto.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Producto producto;
    private String descripcion;
    private String personalizacion;
    private Integer cantidad;
    private Double precio;
    private Double descuento;
    private Double total;
    private String relacion;
    private Integer stock;
}
