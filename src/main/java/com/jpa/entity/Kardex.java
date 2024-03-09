package com.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Kardex {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(targetEntity = Producto.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Producto producto;
    @ManyToOne(targetEntity = Profesional.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Profesional profesional;
    @Column(columnDefinition = "DATE")
    private LocalDate fecha;
    private String tipo;
    private String instancia;
    private Integer cantidad;
    private Double monto;
    private Boolean estado;
}
