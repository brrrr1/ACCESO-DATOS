package com.triana.salesianos.dam.ejdtos.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Alumno {
    private int codAlumno;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;
    private List<MatriculaNotas> matriculas;

}

