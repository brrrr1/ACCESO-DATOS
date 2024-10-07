package com.triana.salesianos.dam.ejdtos.models;

public class MatriculaNotas {
    private int año;
    private double nota;
    private Alumno alumno;
    private Asignatura asignatura;

    // Constructor, getters y setters
    public MatriculaNotas(int año, double nota, Alumno alumno, Asignatura asignatura) {
        this.año = año;
        this.nota = nota;
        this.alumno = alumno;
        this.asignatura = asignatura;
    }

    public int getAño() { return año; }
    public double getNota() { return nota; }
    public Alumno getAlumno() { return alumno; }
    public Asignatura getAsignatura() { return asignatura; }
}