public class ejercicio_biblioteca {

package com.biblioteca;

    public class Libro {
        private String titulo;
        private String autor;
        private String isbn;
    }

    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    // Métodos para obtener la información (Getters)
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }



}