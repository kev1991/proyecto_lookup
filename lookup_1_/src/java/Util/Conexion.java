/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sena
 */
public class Conexion {
    
    

    // #1 declarar variables y objetos
    private String driver, user, password, dataBase, urlBd;

    private Connection conexion;
    private Statement puente;
    private ResultSet mensajero;

    // #2 asignar valores
    public Conexion() {
        driver = "com.mysql.jdbc.Driver";
        user = "root";
        password = "";
        dataBase = "lookup_0.1";
        urlBd = "jdbc:mysql://localhost:3306/" + dataBase;

        // #3 conectar la base de datos 
        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(urlBd, user, password);
            puente = conexion.createStatement();
//            mensajero = puente.executeQuery("Select * from persona");
//            while (mensajero.next()) {
//                int id_persona = mensajero.getInt("id_persona");
//                String nombre = mensajero.getString("nombre");
//                String apellido = mensajero.getString("apellido");
//                String tipo_documento = mensajero.getString("tipo_documento");
//                String numero_documento = mensajero.getString("numero_documento");
//                String email = mensajero.getString("email");
//                System.out.println("id: " + id_persona + "| nombre : " + nombre + "| apellido: " + apellido + "| tipo de documento: " + tipo_documento + " | numero documento: " + numero_documento + " | correo personal: " + email);
//                System.out.println("");
//
//            }
                System.out.println("Conexión OK suuiii");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection obtenerConexion() {
        return conexion;
    }

    public Connection cerrarConexion() throws SQLException {
        conexion.close();
        conexion = null;
        return conexion;
    }
    
    
    
}
