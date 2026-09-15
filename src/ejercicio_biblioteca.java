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


    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }

    public void mostrarInfo() {
        System.out.println("ISBN: " + isbn + " | Título: " + titulo + " | Autor: " + autor);
    }

}