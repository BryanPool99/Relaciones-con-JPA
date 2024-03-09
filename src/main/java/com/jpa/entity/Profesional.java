package com.jpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class Profesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String usuario;
    private String dni;
    private String telefono;
    private String correo;
    private String clave;
    private String nivel;
    @Column(columnDefinition = "DATE")
    private LocalDate registro;
    private Boolean estado;
    @ManyToMany(targetEntity = Producto.class, fetch = FetchType.LAZY)
    @JoinTable(name = "kardex",
            joinColumns = @JoinColumn(name = "profesional_id"),
            inverseJoinColumns = @JoinColumn(name = "producto_id"))
    @JsonIgnore
    private List<Producto> productos;
}
