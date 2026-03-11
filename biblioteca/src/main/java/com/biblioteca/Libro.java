package com.biblioteca;

public class Libro {

    protected String titulo;
    protected String autor;
    protected int numeroEjemplares;
    protected int numeroPrestados;

    public Libro() {
    }
    public Libro(String titulo, String autor, int numeroEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroPrestados = 0;
    }

    public boolean prestamo() {

        if (numeroPrestados < numeroEjemplares) {
            numeroPrestados++;
            return true;
        } else {
            return false;
        }

    }

    public boolean devolucion() {
        if (numeroPrestados > 0) {
            numeroPrestados--;
            return true;
        } else {
            return false;
        }

    }

}