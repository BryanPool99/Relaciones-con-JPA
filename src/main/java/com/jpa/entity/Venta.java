package com.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "DATE")
    private LocalDate actualizacion;
    @Column(columnDefinition = "DATE")
    private LocalDate pedido;
    @Column(columnDefinition = "DATE")
    private LocalDate aceptacion;
    @Column(columnDefinition = "DATE")
    private LocalDate entrega;
    private String consumidor;
    private String queja;
    private String modalidad;
    private String pago;
    private String serie;
    private String numero;
    private String fase;
    private String situacion;
    private Boolean estado;
    @ManyToOne(targetEntity = Comprobante.class, fetch = FetchType.LAZY)
    private Comprobante comprobante;
    @ManyToOne(targetEntity = Cliente.class, fetch = FetchType.LAZY)
    private Cliente cliente;
    @ManyToMany(targetEntity = Producto.class, fetch = FetchType.LAZY)
    @JoinTable(name = "detalle",
            joinColumns = @JoinColumn(name = "venta_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> productos;
}
