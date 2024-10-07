package com.triana.salesianos.dam.ejdtos.models;

import java.util.List;

public class Asignatura {
    private int id;
    private String nombre;
    private int numHoras;
    private List<MatriculaNotas> matriculas;

    // Constructor, getters y setters
    public Asignatura(int id, String nombre, int numHoras, List<MatriculaNotas> matriculas) {
        this.id = id;
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.matriculas = matriculas;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getNumHoras() { return numHoras; }
    public int getCantidadAlumnos() {
        return matriculas.size();
    }
}
