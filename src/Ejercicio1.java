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

