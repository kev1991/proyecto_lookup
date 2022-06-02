/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.RespuestaVO;
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
public class RespuestaDAO extends Conexion implements Crud {

    // #1 declarar  variables y objetos 
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String id_respuesta = "", id_Op_respuesta = "", id_pregunta = "", id_usuario = "";
    private int res_puntaje = 0;

    public RespuestaDAO() {
    }

    
    //#2 Metodo pricipal para recibir los datos del VO 
    public RespuestaDAO(RespuestaVO resVO) {
        super();

        try {
            // #3 Conectanos a la base de datos
            conexion = this.obtenerConexion();

            // #4 traer al DAO los datos del VO para hecer la operaciones
            id_respuesta = resVO.getId_pregunta();
            id_Op_respuesta = resVO.getId_Op_respuesta();
            id_pregunta = resVO.getId_pregunta();
            res_puntaje = resVO.getRes_puntaje();
            id_usuario = resVO.getId_usuario();

        } catch (Exception e) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agrgarRegistro() {
        try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = " insert into respuesta (id_respuesta, id_Op_respuesta, id_pregunta, res_puntaje, id_usuario) values(?,?,?,?,?)";
            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_respuesta);
            puente.setString(2, id_Op_respuesta);
            puente.setString(3, id_pregunta);
            puente.setInt(4, res_puntaje);
            puente.setString(5, id_usuario);

            puente.executeUpdate();
            operacion = true;
        } catch (Exception e) {
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
    
    
    public ArrayList <RespuestaVO> Listar(){
        ArrayList<RespuestaVO>listaRespuesta = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
        sql="select * from respuesta";
        puente = conexion.prepareStatement(sql);
        mensajero= puente.executeQuery();
        
        while(mensajero.next()){
         RespuestaVO resVO = new RespuestaVO(mensajero.getInt(1), mensajero.getString(2),
                        mensajero.getString(3), mensajero.getString(4), mensajero.getString(5));
        
         listaRespuesta.add(resVO);
         
        }
        
        } catch (Exception e) {
            Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(RespuestaDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listaRespuesta;
    }

}
