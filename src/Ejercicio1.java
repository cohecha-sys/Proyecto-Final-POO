package com.biblioteca;

import java.util.Scanner;

public class SistemaBiblioteca {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion = 0;

        while (opcion != 3) {
            System.out.println("\n===== MENÚ DE BIBLIOTECA =====");
            System.out.println("1. Registrar nuevo libro");
            System.out.println("2. Ver todos los libros");
            System.out.println("3. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\n--- REGISTRO DE LIBRO ---");
                    System.out.print("Ingrese el ISBN: ");
                    String isbn = sc.nextLine().trim();

                    if (isbn.isEmpty()) {
                        System.out.println("Error: El ISBN no puede estar vacío.");
                        break;
                    }

                    System.out.print("Ingrese el Título: ");
                    String titulo = sc.nextLine().trim();

                    System.out.print("Ingrese el Autor: ");
                    String autor = sc.nextLine().trim();

                    if (titulo.isEmpty() || autor.isEmpty()) {
                        System.out.println("Error: El título y autor son obligatorios.");
                        break;
                    }

                    Libro nuevoLibro = new Libro(titulo, autor, isbn);

                    if (biblioteca.agregarLibro(nuevoLibro)) {
                        System.out.println("¡Libro registrado exitosamente!");
                    } else {
                        System.out.println("Error: Ya existe un libro con el ISBN " + isbn);
                    }
                    break;

                case 2:
                    biblioteca.listarLibros();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    break;
            }
        }
        sc.close();
    }
}