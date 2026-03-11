package com.biblioteca;

public class Main {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Programación", "Juan Perez", 5);

        LibroTexto libroTexto1 = new LibroTexto(
                "Matemáticas", "Carlos Ruiz", 3, "Algebra");

        LibroTextoUNIAC libroUniac = new LibroTextoUNIAC(
                "Base de Datos", "Ana Lopez", 4, "SQL", "Ingeniería");

        Novela novela1 = new Novela(
                "El misterio", "Gabriel Garcia", 2, "Policiaca");

        System.out.println("Disponibles: " + libro1.calcularDisponibles());

        libro1.prestamo();

        System.out.println("Disponibles después del préstamo: "
                + libro1.calcularDisponibles());

    }

}