/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.CuestionarioVO;
import Util.Conexion;
import Util.Crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kebin
 */
public class CuestionarioDAO extends Conexion implements Crud {

    public CuestionarioDAO() {
    }

    // #1 declarar  variables y objetos 
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String id_cuestionario = "", cues_fecha_cracion = "", cues_nombre = "", cues_is_active = "", cues_descrpcion = "", id_Ca__custionario = "";

    public CuestionarioDAO(CuestionarioVO cuesVO) {
        super();
        try {
            // #3 Conectanos a la base de datos
            conexion = this.obtenerConexion();

            // #4 traer al DAO los datos del VO para hecer la operaciones
            id_cuestionario = cuesVO.getId_cuestionario();
            cues_fecha_cracion = cuesVO.getCues_fecha_cracion();
            cues_nombre = cuesVO.getCues_nombre();
            cues_is_active = cuesVO.getCues_is_active();
            cues_descrpcion = cuesVO.getCues_descrpcion();
            id_Ca__custionario = cuesVO.getId_Ca__custionario();

        } catch (Exception e) {
            Logger.getLogger(CuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    @Override
    public boolean agrgarRegistro() {

        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "insert into cuestionario (id_cuestionario, cues_fecha_cracion, cues_nombre, cues_is_active,cues_descrpcion, id_Ca__custionario) values(?,?,?,?,?,?)";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_cuestionario);
            puente.setString(2, cues_fecha_cracion);
            puente.setString(3, cues_nombre);
            puente.setString(4, cues_is_active);
            puente.setString(5, cues_descrpcion);
            puente.setString(6, id_Ca__custionario);

            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(CuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;

    }

    @Override
    public boolean actualizarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "update cuestionario set  cues_fecha_cracion  =?, cues_nombre  =?, cues_is_active  =?,cues_descrpcion  =?, id_Ca__custionario =? where id_cuestionario  =?";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, cues_fecha_cracion);
            puente.setString(2, cues_nombre);
            puente.setString(3, cues_is_active);
            puente.setString(4, cues_descrpcion);
            puente.setString(5, id_Ca__custionario);
            puente.setString(6, id_cuestionario);

            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(CuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return operacion;
    }

    @Override
    public boolean eleminarRegistro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CuestionarioVO ConsultarCuestionario(String id_cuestionario) {
        CuestionarioVO cuesVO = null;
        try {
            conexion = this.obtenerConexion();
            sql = "select * from cuestionario where id_cuestionario =?";
            puente = conexion.prepareStatement(sql);
            puente.setString(1, id_cuestionario);
            mensajero = puente.executeQuery();

            while (mensajero.next()) {
                cuesVO = new CuestionarioVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6));
            }
        } catch (Exception e) {
            Logger.getLogger(CuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return cuesVO ;
    }
    
    
    
    public ArrayList <CuestionarioVO> listar(){
        ArrayList<CuestionarioVO>listarCuestionarios = new ArrayList<>();
       
        try {
            conexion = this.obtenerConexion();
        sql="select * from cuestionario";
        puente = conexion.prepareStatement(sql);
        mensajero= puente.executeQuery();
        
        while(mensajero.next()){
         CuestionarioVO cuesVO = new CuestionarioVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6));
         listarCuestionarios.add(cuesVO);
        }
        } catch (Exception e) {
        }finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(CuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listarCuestionarios;
    }
    
    
    
    
    
    
    
    
}
