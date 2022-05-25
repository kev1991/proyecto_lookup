/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PersonaVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sena
 */
public class PersonaDAO extends Conexion implements Crud {

    // #1 declarar  variables y objetos 
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String id_persona = "", per_nombre = "", per_segundo_nombre = "", per_apellido = "", per_segundo_apellido = "", per_tipo_documento = "", per_numero_documento = "", per_fecha_nacimiento = "", per_email = "", per_email_corporativo = "", per_cargo = "";

    //#2 Metodo pricipal para recibir los datos del VO 
    public PersonaDAO(PersonaVO perVO) {
            super();

        try {
            // #3 Conectanos a la base de datos
            conexion = this.obtenerConexion();

            // #4 traer al DAO los datos del VO para hecer la operaciones
            id_persona = perVO.getId_persona();
            per_nombre = perVO.getPer_nombre();
            per_segundo_nombre = perVO.getPer_segundo_nombre();
            per_apellido = perVO.getPer_apellido();
            per_segundo_apellido = perVO.getPer_segundo_apellido();
            per_tipo_documento = perVO.getPer_tipo_documento();
            per_numero_documento = perVO.getPer_numero_documento();
            per_fecha_nacimiento = perVO.getPer_fecha_nacimiento();
            per_email = perVO.getPer_email();
            per_email_corporativo = perVO.getPer_email_corporativo();
            per_cargo = perVO.getPer_cargo();

        } catch (Exception e) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agrgarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "insert into persona (id_persona,per_nombre,per_segundo_nombre,per_apellido,per_segundo_apellido,per_tipo_documento,per_numero_documento,per_fecha_nacimiento,per_email,per_email_corporativo,per_cargo) values(?,?,?,?,?,?,?,?,?,?,?)";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_persona);
            puente.setString(2, per_nombre);
            puente.setString(3, per_segundo_nombre);
            puente.setString(4, per_apellido);
            puente.setString(5, per_segundo_apellido);
            puente.setString(6, per_tipo_documento);
            puente.setString(7, per_numero_documento);
            puente.setString(8, per_fecha_nacimiento);
            puente.setString(9, per_email);
            puente.setString(10, per_email_corporativo);
            puente.setString(11, per_cargo);

            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "update persona set per_nombre =?,per_segundo_nombre =?, per_apellido =?, per_segundo_apellido =?, per_tipo_documento=?, per_numero_documento =?, per_fecha_nacimiento =?, per_email =?, per_email_corporativo =?, per_cargo =?   where per_numero_documento =?";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, per_nombre);
            puente.setString(2, per_segundo_nombre);
            puente.setString(3, per_apellido);
            puente.setString(4, per_segundo_apellido);
            puente.setString(5, per_tipo_documento);
            puente.setString(6, per_numero_documento);
            puente.setString(7, per_fecha_nacimiento);
            puente.setString(8, per_email);
            puente.setString(9, per_email_corporativo);
            puente.setString(10, per_cargo);
            puente.setString(11, per_numero_documento);

            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean eleminarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "delete from usuario where id_persona =?";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_persona);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;

    }

    public PersonaVO ConsultarPersona(String per_numero_documento) {
        PersonaVO perVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select * from persona where per_numero_documento=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, per_numero_documento);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                perVO = new PersonaVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8),
                        mensajero.getString(9), mensajero.getString(10), mensajero.getString(11));
            }
        } catch (Exception e) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
      return perVO;
    }
    
    
    public ArrayList <PersonaVO> Listar(){
        ArrayList<PersonaVO>listaPersonas = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
        sql="select * from persona";
        puente = conexion.prepareStatement(sql);
        mensajero= puente.executeQuery();
        
        while(mensajero.next()){
         PersonaVO perVO = new PersonaVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7), mensajero.getString(8),
                        mensajero.getString(9), mensajero.getString(10), mensajero.getString(11));
        
         listaPersonas.add(perVO);
         
        }
        
        } catch (Exception e) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaPersonas;
    }
    
    
    
}
