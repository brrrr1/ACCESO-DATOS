package com.triana.salesianos.dam.ejdtos.dtos;

import java.util.List;

public record CursoDTO(
        int id,
        String nombre,
        String tipo,
        int horasTotales,
        List<AsignaturaDTO> asignaturas
) {}
