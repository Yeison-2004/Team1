package Vista;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import Modelo.dao.*;
import Modelo.vo.Requerimiento_2;
public class Requerimiento2 extends JFrame {

    public Requerimiento2() throws SQLException {
        initUI();
    }
    private void initUI() throws SQLException {
        // TODO: Sele agrego un Titulo, un Boton pero sin ningun Evento, una Etiqueta y una Caja de Texto 
        
        String[]nombres= {"Nombre" , "Primer_Apellido","Ciudad_Residencia" ,"Cargo" , "Salario"};
        JTable tabla = new JTable(mostrar(), nombres );
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        setTitle("𝐑 𝐄 𝐐 𝐔 𝐄 𝐑 𝐈 𝐌 𝐈 𝐄 𝐍 𝐓 𝐎  2.");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 153);//Establecemos el tamaño de la ventana Ancho y Largo
        setLocationRelativeTo(null);//Establecemos la ventana en el centro
        setVisible(true);// Esto es para ver la interfas de ususario

        //Prueba Botón
        JButton botonPrueba = new JButton("Borrar");//Establese un texto al Botón
        // Cambio del color del botón
        botonPrueba.setBackground(Color.DARK_GRAY);
        botonPrueba.setForeground(Color.WHITE);
        // Se crea un panel para contener al botón
        tabla.add(botonPrueba);
        add(botonPrueba, BorderLayout.SOUTH);


        //Etiqueta
        JLabel label = new JLabel();
        label.setText("  Escribe sobre la Tabla..... ");
        label.setForeground(Color.GRAY);//Establecemos el color de la Etiqueta
        tabla.add(label);
        add(label,BorderLayout.BEFORE_FIRST_LINE);

        //Espacio de texto o caja de Texto
        JTextField tf = new JTextField();
        tabla.add(tf);
        add(tf,BorderLayout.BEFORE_FIRST_LINE);


        //Area de texto
        // JTextArea ta = new JTextArea();
        // tabla.add(ta);
        // add(ta,BorderLayout.BEFORE_FIRST_LINE);
    
    }

    public String[][] mostrar() throws SQLException {
        ArrayList<Requerimiento_2> lista2 = new ArrayList<Requerimiento_2>();
        Requerimiento_2Dao requerimiento_2 =new Requerimiento_2Dao();
        lista2= requerimiento_2.requerimiento2();
        String matris[][]= new String [lista2.size()][5];
        for (int i = 0; i < lista2.size(); i++) {
            matris[i][0]=lista2.get(i).getNombre();
            matris[i][1]=lista2.get(i).getPrimer_Apellido();
            matris[i][2]=lista2.get(i).getCiudad_Residencia();
            matris[i][3]=lista2.get(i).getCargo();
            matris[i][4]=lista2.get(i).getSalario();

        }
        
        return matris;
    }
}
