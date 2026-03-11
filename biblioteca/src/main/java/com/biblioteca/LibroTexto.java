package com.biblioteca;

public class LibroTexto extends Libro {

    private String curso;

    public LibroTexto(String titulo, String autor, int numeroEjemplares, String curso) {
        super(titulo, autor, numeroEjemplares);
        this.curso = curso;
    }

}