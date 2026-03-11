package com.biblioteca;

public class LibroTextoUNIAC extends LibroTexto {

    private String facultad;

    public LibroTextoUNIAC(String titulo, String autor, int numeroEjemplares, String curso, String facultad) {
        super(titulo, autor, numeroEjemplares, curso);
        this.facultad = facultad;
    }

}