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
public class Queja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String motivo;
    private String accion;
    private String situacion;
    private Boolean estado;
    @ManyToOne(targetEntity = Venta.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Venta venta;
}
