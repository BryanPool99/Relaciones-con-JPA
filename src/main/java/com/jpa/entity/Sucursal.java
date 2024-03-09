package com.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String descripcion;
    private String telefono;
    private String direccion;
    private Boolean estado;
    @ManyToOne(targetEntity = Distrito.class, fetch = FetchType.LAZY)
    private Distrito distrito;

}
