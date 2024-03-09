package com.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    @ManyToOne(targetEntity = Color.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Color color;
    @ManyToOne(targetEntity = Genero.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Genero genero;
    @ManyToOne(targetEntity = Marca.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Marca marca;
    @ManyToOne(targetEntity = Talla.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Talla talla;
    @ManyToOne(targetEntity = Categoria.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Categoria categoria;
    @ManyToOne(targetEntity = Sucursal.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Sucursal sucursal;
    @ManyToMany(targetEntity = Profesional.class, fetch = FetchType.LAZY)
    @JoinTable(name = "kardex",
            joinColumns = @JoinColumn(name = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "profesional_id"))
    @JsonIgnore
    private List<Profesional> profesionals;
    @ManyToMany(targetEntity = Venta.class, fetch = FetchType.LAZY)
    @JoinTable(name = "detalle",
            joinColumns = @JoinColumn(name = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "venta_id"))
    @JsonIgnore
    private List<Venta> ventas;
}
