/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.UsuarioVO;
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
public class UsuarioDAO extends Conexion implements Crud {

    // #1 declarar  variables y objetos 
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String id_usuario = "", user_name = "", user_password = "", user_is_active = "", id_persona = "", id_perfil = "";

    //#2 Metodo pricipal para recibir los datos del VO 
    public UsuarioDAO(UsuarioVO usuVO) {
        super();
        try {
            // #3 Conectanos a la base de datos
            conexion = this.obtenerConexion();

            // #4 traer al DAO los datos del VO para hecer la operaciones
            id_usuario = usuVO.getId_usuario();
            user_name = usuVO.getUser_name();
            user_password = usuVO.getUser_password();
            user_is_active = usuVO.getUser_is_active();
            id_persona = usuVO.getId_persona();
            id_perfil = usuVO.getId_perfil();
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public UsuarioDAO() {
    }

   

    @Override
    public boolean agrgarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "insert into usuario (id_usuario, user_name, user_password, user_is_active, id_persona, id_perfil) values(?,?,?,?,?,?)";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_usuario);
            puente.setString(2, user_name);
            puente.setString(3, user_password);
            puente.setString(4, user_is_active);
            puente.setString(5, id_persona);
            puente.setString(6, id_perfil);
            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        try {
        //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "update usuario set user_name =?,id_perfil =?, user_password =?, user_is_active =?, id_persona=? where user_name =?";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, user_name);
            puente.setString(2, id_perfil);
            puente.setString(3, user_password);
            puente.setString(4, user_is_active);
            puente.setString(5, id_persona);
            puente.setString(6, user_name);

            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean eleminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean iniciarSesion(String usuario, String clave) {

        try {
            //#1 establecer la conexion
            conexion = this.obtenerConexion();
            //#2 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "select * from usuario where user_name=? and user_password=?";
            // #3 crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);
            // #4 desicnamos los valores en los interrogantes
            puente.setString(1, usuario);
            puente.setString(2, clave);
            //
            mensajero = puente.executeQuery();

            if (mensajero.next()) {
                operacion = true;
            }

        } catch (SQLException e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    public ArrayList<UsuarioVO> listar() {
        ArrayList<UsuarioVO> listarUsuarios = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from usuario";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                UsuarioVO usuVO = new UsuarioVO(mensajero.getString(1), mensajero.getString(2), mensajero.getString(3), mensajero.getString(4), mensajero.getString(5), mensajero.getString(6));
                listarUsuarios.add(usuVO);
            }
        } catch (Exception e) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listarUsuarios;
    }
    
    
    
    
}
