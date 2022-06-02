/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.PreguntaVO;
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
public class PreguntaDAO extends Conexion implements Crud {
    
    // #1 declarar  variables y objetos 
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String id_pregunta ="", pre_title ="", pre_descripcion ="",pre_is_active ="", pre_is_multiple ="", pre_create_at ="", pre_puntaje ="", id_cuestionario ="";

    public PreguntaDAO() {
    }
    
    //#2 Metodo pricipal para recibir los datos del VO 
    public PreguntaDAO(PreguntaVO preVO){
        super();
        try {
            // #3 Conectanos a la base de datos
            conexion = this.obtenerConexion();

            // #4 traer al DAO los datos del VO para hecer la operaciones
            id_pregunta =preVO.getId_pregunta();
            pre_title =preVO.getPre_title();
            pre_descripcion =preVO.getPre_descripcion();
            pre_is_active =preVO.getPre_is_active();
            pre_is_multiple =preVO.getPre_is_multiple();
            pre_create_at =preVO.getPre_create_at();
            id_cuestionario =preVO.getId_cuestionario();
        } catch (Exception e) {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    

    @Override
    public boolean agrgarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "insert into pregunta (id_pregunta,pre_title,pre_descripcion,pre_is_active,pre_is_multiple,pre_create_at,id_cuestionario) values(?,?,?,?,?,?,?)";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_pregunta);
            puente.setString(2, pre_title);
            puente.setString(3, pre_descripcion);
            puente.setString(4, pre_is_active);
            puente.setString(5, pre_is_multiple);
            puente.setString(6, pre_create_at);
            puente.setString(7, id_cuestionario);
            
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
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
    
    
    
    public ArrayList <PreguntaVO> Listar(){
        ArrayList<PreguntaVO>listaPreguntas = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
        sql="select * from pregunta";
        puente = conexion.prepareStatement(sql);
        mensajero= puente.executeQuery();
        
        while(mensajero.next()){
         PreguntaVO preVO = new PreguntaVO(mensajero.getString(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5),
                        mensajero.getString(6), mensajero.getString(7));
        
         listaPreguntas.add(preVO);
         
        }
        
        } catch (Exception e) {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaPreguntas;
    }
    
    public boolean responder() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "insert into pregunta (id_pregunta,pre_title,pre_descripcion,pre_is_active,pre_is_multiple,pre_create_at,id_cuestionario) values(?,?,?,?,?,?,?)";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_pregunta);
            puente.setString(2, pre_title);
            puente.setString(3, pre_descripcion);
            puente.setString(4, pre_is_active);
            puente.setString(5, pre_is_multiple);
            puente.setString(6, pre_create_at);
            puente.setString(7, id_cuestionario);
            
            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
            Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
        }finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(PreguntaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }

        return operacion;
    }
    
    
    
    
    
    
    
}
