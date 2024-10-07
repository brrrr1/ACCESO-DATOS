package com.triana.salesianos.dam.ejdtos.models;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;



// Clase Curso
public class Curso {
    private int id;
    private String nombre;
    private TipoCurso tipo;
    private List<Asignatura> asignaturas;

    // Constructor, getters y setters
    public Curso(int id, String nombre, TipoCurso tipo, List<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.asignaturas = asignaturas;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public TipoCurso getTipo() { return tipo; }
    public List<Asignatura> getAsignaturas() { return asignaturas; }

    public int getHorasTotales() {
        return asignaturas.stream().mapToInt(Asignatura::getNumHoras).sum();
    }
}