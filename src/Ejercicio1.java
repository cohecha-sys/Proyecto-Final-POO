package com.biblioteca;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.Year;

public class VentanaRegistro extends JFrame {

    private Biblioteca biblioteca;

    private JTextField txtTitulo, txtAutor, txtIsbn, txtAnio, txtCopias;
    private JComboBox<String> cbGenero;
    private JTable tablaLibros;
    private DefaultTableModel modeloTabla;

    private static final String[] GENEROS = {"Seleccione...", "Novela", "Ciencia", "Historia", "Infantil", "Técnico"};

    public VentanaRegistro() {
        biblioteca = new Biblioteca();

        setTitle("Ejercicio 1: Registrar Libro");
        setSize(750, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel panelFormulario = new JPanel(new GridLayout(7, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder(" Formulario de Registro "));


    }
}