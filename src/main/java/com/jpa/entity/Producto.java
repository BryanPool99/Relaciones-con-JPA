package com.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String presentacion;
    private Double costo;
    private Double precio;
    private Integer cantidad;
    private String palabra;
    private String imagen;
    private Boolean estado;
    @ManyToOne(targetEntity = Color.class, fetch = FetchType.LAZY)
    private Color color;
    @ManyToOne(targetEntity = Genero.class, fetch = FetchType.LAZY)
    private Genero genero;
    @ManyToOne(targetEntity = Marca.class, fetch = FetchType.LAZY)
    private Marca marca;
    @ManyToOne(targetEntity = Talla.class, fetch = FetchType.LAZY)
    private Talla talla;
    @ManyToOne(targetEntity = Categoria.class, fetch = FetchType.LAZY)
    private Categoria categoria;
    @ManyToOne(targetEntity = Sucursal.class, fetch = FetchType.LAZY)
    private Sucursal sucursal;
    @ManyToMany(targetEntity = Profesional.class, fetch = FetchType.LAZY)
    @JoinTable(name = "kardex",
            joinColumns = @JoinColumn(name = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "profesional_id"))
    private List<Profesional> profesionals;
    @ManyToMany(targetEntity = Venta.class, fetch = FetchType.LAZY)
    @JoinTable(name = "detalle",
            joinColumns = @JoinColumn(name = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "venta_id"))
    private List<Venta> ventas;
}
