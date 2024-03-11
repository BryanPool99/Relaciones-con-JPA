package com.jpa.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaDTO {
    private Long id;
    private String descripcion;
    private Boolean tienda;
    private Boolean delivery;
    private Boolean temporada;
    private Boolean estado;
}
