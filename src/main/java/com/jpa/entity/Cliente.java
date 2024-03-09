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
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String correo;
    private String clave;
    private String direccion;
    private String referencia;
    @Column(columnDefinition = "DATE")
    private LocalDate registro;
    @ManyToOne(targetEntity = Distrito.class, fetch = FetchType.EAGER)
    @JsonIgnore
    private Distrito distrito;
}
