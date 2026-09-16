public class Biblioteca {
    static void main(String[] args) {

package com.biblioteca;

import java.util.ArrayList;

        public class Biblioteca {
            // Array dinámico para almacenar los libros
            private ArrayList<Libro> listaLibros;

            public Biblioteca() {
                this.listaLibros = new ArrayList<>();
            }

            // Método para validar si el ISBN ya existe usando un ciclo FOR y un IF
            public boolean existeIsbn(String isbn) {
                for (int i = 0; i < listaLibros.size(); i++) {
                    if (listaLibros.get(i).getIsbn().equalsIgnoreCase(isbn)) {
                        return true; // Ya existe
                    }
                }
                return false; // No existe
            }

            // Método para agregar libro con validación
            public boolean agregarLibro(Libro libro) {
                if (existeIsbn(libro.getIsbn())) {
                    return false; // Error: duplicado
                }
                listaLibros.add(libro); // Agrega al arreglo
                return true;
            }

            // Método para listar todos los libros con un ciclo
            public void listarLibros() {
                if (listaLibros.isEmpty()) {
                    System.out.println("No hay libros registrados en el sistema.");
                } else {
                    System.out.println("\n--- LISTA DE LIBROS REGISTRADOS ---");
                    for (int i = 0; i < listaLibros.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        listaLibros.get(i).mostrarInfo();
                    }
                }
            }
        }