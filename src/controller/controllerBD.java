/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import model.connectBD;

/**
 *
 * @author Sandra
 */
public class controllerBD {
    
    private final connectBD con;
 
    public controllerBD(){
        
        this.con = new connectBD();
        
    }
    
    public void CrearConexion() throws SQLException{
        
        this.con.EstablecerConexion();
    }
    
    public ResultSet mandarSql(String sql) throws SQLException{
        ResultSet aux_result=this.con.EjecutarSentencia(sql);
        return aux_result;
        
    }
}
