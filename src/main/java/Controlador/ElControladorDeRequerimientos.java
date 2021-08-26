package Controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import Modelo.dao.Requerimiento_1Dao;
import Modelo.dao.Requerimiento_2Dao;
import Modelo.dao.Requerimiento_3Dao;

import Modelo.vo.Requerimiento_1;
import Modelo.vo.Requerimiento_2;
import Modelo.vo.Requerimiento_3;

public class ElControladorDeRequerimientos {
    //Creando constantes 
    private final Requerimiento_1Dao REQUERIMIENTO_1DAO;
    private final Requerimiento_2Dao REQUERIMIENTO_2DAO;
    private final Requerimiento_3Dao REQUERIMIENTO_3DAO;

    public ElControladorDeRequerimientos(){
        //A las constantes les asicno un objeto
        this.REQUERIMIENTO_1DAO= new Requerimiento_1Dao();
        this.REQUERIMIENTO_2DAO= new Requerimiento_2Dao();
        this.REQUERIMIENTO_3DAO= new Requerimiento_3Dao();
    }
    
        public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
            // Su código estoy asiendo un llamado 
            return this.REQUERIMIENTO_1DAO.requerimiento1();
        }
    
        public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
            // Su código
            return this.REQUERIMIENTO_2DAO.requerimiento2();
        }
    
        public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
            // Su código
            return this.REQUERIMIENTO_3DAO.requerimiento3();
        } 

}
