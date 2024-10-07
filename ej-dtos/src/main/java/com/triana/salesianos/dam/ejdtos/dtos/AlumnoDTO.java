package com.triana.salesianos.dam.ejdtos.dtos;

import java.util.List;

public record AlumnoDTO(
        int id,
        String nombreCompleto,
        int edadA31Diciembre,
        List<String> asignaturas
) {}
