/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloDAO;

import ModeloVO.DiligcuestionarioVO;
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
public class DiligcuestionarioDAO extends Conexion implements Crud {

    // #1 declarar  variables y objetos 
    private Connection conexion;
    private PreparedStatement puente;
    private ResultSet mensajero;

    private boolean operacion = false;
    private String sql;

    private String id_diligenciamiento_cuestionario = "", dili_concentimiento_BRP = "", dili_is_active = "", dili_fecha_aplicacin = "", id_usuario = "", id_cuestionario="";

    public DiligcuestionarioDAO() {
    }

    //#2 Metodo pricipal para recibir los datos del VO 
    public DiligcuestionarioDAO(DiligcuestionarioVO diliVO) {
        super();
        try {
            // #3 Conectanos a la base de datos
            conexion = this.obtenerConexion();
            
            // #4 traer al DAO los datos del VO para hecer la operaciones
            id_diligenciamiento_cuestionario = diliVO.getId_diligenciamiento_cuestionario();
            dili_concentimiento_BRP = diliVO.getDili_concentimiento_BRP();
            dili_is_active = diliVO.getDili_is_active();
            dili_fecha_aplicacin = diliVO.getDili_fecha_aplicacin();
            id_usuario = diliVO.getId_usuario();
            id_cuestionario = diliVO.getId_cuestionario();
            
        } catch (Exception e) {
            Logger.getLogger(DiligcuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

    }

    @Override
    public boolean agrgarRegistro() {
         try {
            //#1 armar la sentencia se usan los (?,?) para incrptar los datos
            sql = "insert into diligenciamiento_cuestionario(id_diligenciamiento_cuestionario, dili_concentimiento_BRP, dili_is_active, dili_fecha_aplicacin, id_usuario, id_cuestionario) values(?,?,?,?,?,?)";

            // crear el camino donde va la sentancia usando el puente o el (prepareStatement)
            puente = conexion.prepareStatement(sql);

            //desicnamos los valores en los interrogantes
            puente.setString(1, id_diligenciamiento_cuestionario);
            puente.setString(2, dili_concentimiento_BRP);
            puente.setString(3, dili_is_active);
            puente.setString(4, dili_fecha_aplicacin);
            puente.setString(5, id_usuario);
            puente.setString(6, id_cuestionario);
            

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
    
    
    public ArrayList <DiligcuestionarioVO> Listar(){
        ArrayList<DiligcuestionarioVO>listar = new ArrayList<>();
        try {
            conexion = this.obtenerConexion();
        sql="select * from vehiculo";
        puente = conexion.prepareStatement(sql);
        mensajero= puente.executeQuery();
        
        while(mensajero.next()){
         DiligcuestionarioVO diliVO = new DiligcuestionarioVO(mensajero.getString (1),mensajero.getString (2),
                    mensajero.getString (3),mensajero.getString (4),mensajero.getString(5),mensajero.getString(6));
        
         listar.add(diliVO);
         
        }
        
        } catch (Exception e) {
            Logger.getLogger(DiligcuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            try {
                this.cerrarConexion();
            } catch (Exception e) {
                Logger.getLogger(DiligcuestionarioDAO.class.getName()).log(Level.SEVERE, null, e);
            }
        }
        return listar;
    }
    
    

}
