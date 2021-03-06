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
import Modelo.vo.Requerimiento_1;

public class Requerimiento1 extends JFrame{
    public Requerimiento1() throws SQLException {
        initUI();
    }
    private void initUI() throws SQLException {
        // TODO: Sele agrego un Titulo, un Boton pero sin ningun Evento, una Etiqueta y una Caja de Texto 
        
        String[]nombres= {"Ciudad", "Acabados", "Clasificacion", "Banco_Vinculado", "Constructora"};
        JTable tabla = new JTable(mostrar(), nombres );
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        //* Le agregue un Titulo a la ventana
        setTitle(" 饾悜 饾悇 饾悙 饾悢 饾悇 饾悜 饾悎 饾悓 饾悎 饾悇 饾悕 饾悡 饾悗  1.");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);//Establecemos el tama帽o de la ventana Ancho y Largo
        setLocationRelativeTo(null);//Establecemos la ventana en el centro
        setVisible(true);

        //* Prueba Bot贸n
        JButton botonPrueba = new JButton("Borrar");//Establese un texto al Bot贸n
        // Cambio del color del bot贸n
        botonPrueba.setBackground(Color.DARK_GRAY);//Color del Fondo del Boton Gris Oscuro
        botonPrueba.setForeground(Color.WHITE);//Color de la letra Blanco
        // Se crea un panel para contener al bot贸n 
        tabla.add(botonPrueba);
        add(botonPrueba, BorderLayout.SOUTH);//Ubicaci贸n del boton

        //* Etiqueta
        JLabel label = new JLabel();//Creamos la etiqueta y la instanciamos
        label.setText("  Escribe sobre la Tabla..... ");
        label.setForeground(Color.GRAY);//Establecemos el color de la Etiqueta
        tabla.add(label);
        add(label,BorderLayout.BEFORE_FIRST_LINE);// Ubicado ANTES DE LA PRIMERA LINEA

        
        //* Espacio de texto 
        JTextField tf = new JTextField();
        tabla.add(tf);
        add(tf,BorderLayout.BEFORE_FIRST_LINE);

        //*caja de Texto
        // JTextArea ta = new JTextArea();
        // tabla.add(ta);
        // add(ta,BorderLayout.BEFORE_FIRST_LINE);

        // Radio Botones
        // JRadioButton radioButton1 = new JRadioButton("JRadioButton", true);
        // radioButton1.setBounds(50, 100, 100, 30);
        // tabla.add(radioButton1);

    }

    

    public String[][] mostrar() throws SQLException {
        ArrayList<Requerimiento_1> lista = new ArrayList<Requerimiento_1>();
        Requerimiento_1Dao requerimiento_1 =new Requerimiento_1Dao();
        lista= requerimiento_1.requerimiento1();
        String matris[][]= new String [lista.size()][5];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0]=lista.get(i).getCiudad();
            matris[i][1]=lista.get(i).getAcabados();
            matris[i][2]=lista.get(i).getClasificacion();
            matris[i][3]=lista.get(i).getBanco_Vinculado();
            matris[i][4]=lista.get(i).getConstructora();
        }
        
        return matris;
    }
}
