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
import Modelo.vo.Requerimiento_3;

public class Requerimiento3 extends JFrame{
    public Requerimiento3() throws SQLException {
        initUI();
    }
    private void initUI() throws SQLException {
        // TODO: Sele agrego un Titulo, un Boton pero sin ningun Evento, una Etiqueta y una Caja de Texto 

        String[]nombres= {"c.Proveedor", "c.Pagado" , "p.Constructora"};
        JTable tabla = new JTable(mostrar(), nombres );
        JScrollPane panel = new JScrollPane(tabla);
        add(panel, BorderLayout.CENTER);

        //* Le agregue un Titulo a la ventana
        setTitle(" 𝐑 𝐄 𝐐 𝐔 𝐄 𝐑 𝐈 𝐌 𝐈 𝐄 𝐍 𝐓 𝐎  3.");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);//Establecemos el tamaño de la ventana Ancho y Largo
        setLocationRelativeTo(null);//Establecemos la ventana en el centro
        setVisible(true);

        //* Prueba Botón
        JButton botonPrueba = new JButton("Borrar");//Establese un texto al Botón
        botonPrueba.setSize(80, 40);
        // Cambio del color del botón
        botonPrueba.setBackground(Color.DARK_GRAY);
        botonPrueba.setForeground(Color.WHITE);
        // Se crea un panel para contener al botón
        tabla.add(botonPrueba);
        add(botonPrueba, BorderLayout.SOUTH);

        //* Etiqueta
        JLabel label = new JLabel();
        label.setText("  Escribe sobre la Tabla..... ");
        label.setForeground(Color.GRAY);//Establecemos el color de la Etiqueta
        tabla.add(label);
        add(label,BorderLayout.BEFORE_FIRST_LINE);

        
        //Espacio de texto o caja de Texto
        JTextField tf = new JTextField(20);
        tabla.add(tf);
        add(tf,BorderLayout.BEFORE_FIRST_LINE);


        //*Radio Botones
        // JRadioButton radioButton1 = new JRadioButton("JRadioButton", true);
        // radioButton1.setBounds(50, 100, 100, 30);
        // tabla.add(radioButton1);

    //     JTextArea ta = new JTextArea();
    //     tabla.add(ta);
    //     add(ta,BorderLayout.BEFORE_FIRST_LINE);
    
        }

    

    public String[][] mostrar() throws SQLException {
        ArrayList<Requerimiento_3> lista3 = new ArrayList<Requerimiento_3>();
        Requerimiento_3Dao requerimiento_3 =new Requerimiento_3Dao();
        lista3= requerimiento_3.requerimiento3();
        String matris[][]= new String [lista3.size()][3];
        for (int i = 0; i < lista3.size(); i++) {
            matris[i][0]=lista3.get(i).getProveedor();
            matris[i][1]=lista3.get(i).getPagado();
            matris[i][2]=lista3.get(i).getConstructora();
        }
        
        return matris;
    }

}
