/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;


import ModeloVO.PerfilVO;
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
public class PerfilDAO extends Conexion implements Crud{
    // #1 declarar  variables y objetos 
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;
    
    private String id_perfil="", nombre="";
    
    public PerfilDAO(PerfilVO perfVo){
        try {
            // #3 Conectanos a la base de datos
            conexion = this.obtenerConexion();
            
            // #4 traer al DAO los datos del VO para hecer la operaciones
            id_perfil = perfVo.getId_perfil();
            nombre = perfVo.getPerfil();;
        } catch (Exception e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
        }
}

    @Override
    public boolean agrgarRegistro() {
        
        try {
        //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "insert into perfil (id_perfil, nombre) values(?,?)";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);
            //desicnamos los valores en los interrogantes
            puente.setString(1,id_perfil);
            puente.setString(2,nombre);
            
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "update perfil set perfil =? where id_perfil =?";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, nombre);
            puente.setString(2, id_perfil);
            
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean eleminarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "delete from perfil where id_perfil =?";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_perfil);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }
    
    
     public PerfilVO ConsultaPerfil(String id_perfil) {
        PerfilVO perfVO = null;

        try {
            conexion = this.obtenerConexion();
            sql = "select * from perfil where id_perfil=?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_perfil);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                perfVO = new PerfilVO(mensajero.getString(1), mensajero.getString(2));
            }
        } catch (Exception e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
      return perfVO;
    }
    
    
     public ArrayList <PerfilVO> Listar(){
        ArrayList<PerfilVO>listarPerfil = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
        sql="select * from perfil";
        puente = conexion.prepareStatement(sql);
        mensajero= puente.executeQuery();
        
        while(mensajero.next()){
         PerfilVO perfVo = new PerfilVO(mensajero.getString(1), mensajero.getString(2));
        
         listarPerfil.add(perfVo);
         
        }
        
        } catch (Exception e) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listarPerfil;
    }
    
    
    
    
    
    
    
}