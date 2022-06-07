/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author kebin
 */
public class RespuestaVO {
     // #1 crear variables 
    
    private String  id_respuesta, id_Op_respuesta, id_pregunta;
    private int  res_puntaje;
    private String id_usuario;
    // #2 crear contructo vacio
    public RespuestaVO() {
    }
    
    
    //#3 crear constructor lleno 
    public RespuestaVO( String id_respuesta, String id_Op_respuesta, String id_pregunta, int res_puntaje,String id_usuario) {
       
        this.id_respuesta = id_respuesta;
        this.id_Op_respuesta = id_Op_respuesta;
        this.id_pregunta = id_pregunta;
         this.res_puntaje = res_puntaje;
        this.id_usuario = id_usuario;
    }
    
    //#4 crear ge and set de todos las variables 


    

    public String getId_respuesta() {
        return id_respuesta;
    }

    public void setId_respuesta(String id_respuesta) {
        this.id_respuesta = id_respuesta;
    }

    public String getId_Op_respuesta() {
        return id_Op_respuesta;
    }

    public void setId_Op_respuesta(String id_Op_respuesta) {
        this.id_Op_respuesta = id_Op_respuesta;
    }

    public String getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(String id_pregunta) {
        this.id_pregunta = id_pregunta;
    }
    
    public int getRes_puntaje() {
        return res_puntaje;
    }

    public void setRes_puntaje(int res_puntaje) {
        this.res_puntaje = res_puntaje;
    }
    
    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    
}
