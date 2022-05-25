/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CategoriCuestionarioVO;
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
public class CategoriCuestionarioDAO extends Conexion implements Crud  {
    
    // #1 declarar  variables y objetos 
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String id_Ca__custionario = "", nombre_custionario = "";

    public CategoriCuestionarioDAO() {
    }
    
    
    //#2 Metodo pricipal para recibir los datos del VO 
    public CategoriCuestionarioDAO(CategoriCuestionarioVO catVO){
        super();
        
        try {
            // #3 Conectanos a la base de datos
            conexion = this.obtenerConexion();
            
            // #4 traer al DAO los datos del VO para hecer la operaciones
            id_Ca__custionario = catVO.getId_Ca__custionario();
            nombre_custionario = catVO.getNombre_custionario();
            
        } catch (Exception e) {
            Logger.getLogger(CategoriCuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agrgarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "insert into categoria_custionario (id_Ca__custionario, nombre_custionario) values(?,?)";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_Ca__custionario);
            puente.setString(2, nombre_custionario);
            

            puente.executeUpdate();
            operacion = true;

        } catch (SQLException e) {
            Logger.getLogger(CategoriCuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);

        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CategoriCuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }

    @Override
    public boolean actualizarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eleminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ArrayList<CategoriCuestionarioVO> listar() {
        ArrayList<CategoriCuestionarioVO> listarcatcuestionario = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
            sql = "select * from categoria_custionario";
            puente = conexion.prepareStatement(sql);
            mensajero = puente.executeQuery();
            while (mensajero.next()) {
                CategoriCuestionarioVO catcuesVO = new CategoriCuestionarioVO(mensajero.getString(1), mensajero.getString(2));
                listarcatcuestionario.add(catcuesVO);
            }
        } catch (Exception e) {
            Logger.getLogger(CategoriCuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CategoriCuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listarcatcuestionario;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
