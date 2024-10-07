package com.triana.salesianos.dam.ejdtos.dtos;

public record AsignaturaDTO(
        int id,
        String nombre,
        int numHoras,
        int cantidadAlumnos
) {}