public class Biblioteca {
    static void main(String[] args) {

package com.biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

        public class Biblioteca {
            private List<Libro> listaLibros;
            private Set<String> isbnRegistrados;

            public Biblioteca() {
                this.listaLibros = new ArrayList<>();
                this.isbnRegistrados = new HashSet<>();
            }

            public boolean existeIsbn(String isbn) {
                return isbnRegistrados.contains(isbn.trim().toLowerCase());
            }

            public boolean agregarLibro(Libro libro) {
                String isbnLimpio = libro.getIsbn().trim().toLowerCase();
                if (existeIsbn(isbnLimpio)) {
                    return false;
                }
                listaLibros.add(libro);
                isbnRegistrados.add(isbnLimpio);
                return true;
            }

