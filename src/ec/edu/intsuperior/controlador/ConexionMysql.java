/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.ConeccionBaseDatos;
import ec.edu.intsuperior.modelo.Permisos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author userpc
 */
public class ConexionMysql {

    Connection conn = null;
    ConeccionBaseDatos cbd = new ConeccionBaseDatos();
    ResultSetMetaData metaDatos = null;

    public void conectarMySQL() {

        try {
            Class.forName(cbd.driver);
            conn = DriverManager.getConnection(cbd.url, cbd.username, cbd.password);
            //System.out.println("Conexion Establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
       // return conn;
    }

    public void Cerrar() {
        if (null != conn) {
            try {
                conn.close();
               // System.out.println("|>ConexionCerrada<|");
            } catch (SQLException ex) {
                Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public String EscrituraQuery(String query) {

        String salida = "";
        try {
            PreparedStatement pstm = conn.prepareStatement(query);
            salida = "Query Correcto";
            Cerrar();
        } catch (SQLException ex) {
            salida = ex.getMessage();
        }
        return salida;
    }

    public ResultSet LecturaQuery(String query) {
        Statement s = null;
        ResultSet rs = null;
        try {
            s = conn.createStatement();
            rs = s.executeQuery(query);
           // Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public Permisos permisosActivos(String usuario){
         Permisos permisos=new Permisos();
         conectarMySQL();
        try {
           
            ResultSet rs1 = LecturaQuery("SELECT usu_usuario,permTipo,PermisosGenerales  FROM usuarios JOIN permisos ON permisos.idPermisos = usuarios.Permisos_idPermisos where usuarios.usu_usuario = '"+usuario+"';");
           while(rs1.next()){
            permisos.setTipo(rs1.getString("permTipo"));
            permisos.setCadenaPermisos(rs1.getString("PermisosGenerales"));
           }
           //System.out.println(permisos.toString());
            Cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return permisos;
    }
    /**
     *Retorna las bases de datos del servidor
     * @return salida
     */
    
    public ArrayList<Object> BasesDatos() {
        conectarMySQL();
        ArrayList<Object> salida = new ArrayList<>();
        try {
            ResultSet rs1 = LecturaQuery("SHOW DATABASES;");
            while (rs1.next()) {
                salida.add(rs1.getString(1));
            }
            Cerrar();
            return salida;
        } catch (SQLException ex) {
            Logger.getLogger(ConexionMysql.class.getName()).log(Level.SEVERE, null, ex);
        }
        return salida;
    }

}
