package com.biblioteca;

public class Novela extends Libro {

    private String tipos;

    public Novela(String titulo, String autor, int numeroEjemplares, String tipos) {
        super(titulo, autor, numeroEjemplares);
        this.tipos = tipos;
    }

}