package com.biblioteca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Libro libro1 = new Libro("Programación Java", "Juan Perez", 5);

        Libro libro2 = new Libro();

        System.out.println("Ingrese titulo del libro:");
        libro2.titulo = sc.nextLine();

        System.out.println("Ingrese autor:");
        libro2.autor = sc.nextLine();

        System.out.println("Ingrese número de ejemplares:");
        libro2.numeroEjemplares = sc.nextInt();

        LibroTextoUNIAC libroUniac = new LibroTextoUNIAC(
                "Base de Datos",
                "Carlos Ruiz",
                4,
                "SQL",
                "Ingenieria");

        Novela novela1 = new Novela(
                "El misterio del bosque",
                "Gabriel Garcia",
                3,
                "Policiaca");

        System.out.println("\nPréstamo libro1: " + libro1.prestamo());

        System.out.println("Devolución libro1: " + libro1.devolucion());

    }

}