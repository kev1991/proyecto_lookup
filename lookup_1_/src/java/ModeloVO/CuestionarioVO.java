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
public class CuestionarioVO {
    // definir variables
     private String id_cuestionario, cues_fecha_cracion, cues_nombre, cues_is_active,cues_descrpcion, id_Ca__custionario;
     
     
     //crear contructor vacio
    public CuestionarioVO() {
    }

    // crear constructor
    public CuestionarioVO(String id_cuestionario, String cues_fecha_cracion, String cues_nombre, String cues_is_active, String cues_descrpcion, String id_Ca__custionario) {
        this.id_cuestionario = id_cuestionario;
        this.cues_fecha_cracion = cues_fecha_cracion;
        this.cues_nombre = cues_nombre;
        this.cues_is_active = cues_is_active;
        this.cues_descrpcion = cues_descrpcion;
        this.id_Ca__custionario = id_Ca__custionario;
    }

     
     
     // creara gets y sers
    public String getId_cuestionario() {
        return id_cuestionario;
    }

    public void setId_cuestionario(String id_cuestionario) {
        this.id_cuestionario = id_cuestionario;
    }

    public String getCues_fecha_cracion() {
        return cues_fecha_cracion;
    }

    public void setCues_fecha_cracion(String cues_fecha_cracion) {
        this.cues_fecha_cracion = cues_fecha_cracion;
    }

    public String getCues_nombre() {
        return cues_nombre;
    }

    public void setCues_nombre(String cues_nombre) {
        this.cues_nombre = cues_nombre;
    }

    public String getCues_is_active() {
        return cues_is_active;
    }

    public void setCues_is_active(String cues_is_active) {
        this.cues_is_active = cues_is_active;
    }

    public String getCues_descrpcion() {
        return cues_descrpcion;
    }

    public void setCues_descrpcion(String cues_descrpcion) {
        this.cues_descrpcion = cues_descrpcion;
    }

    public String getId_Ca__custionario() {
        return id_Ca__custionario;
    }

    public void setId_Ca__custionario(String id_Ca__custionario) {
        this.id_Ca__custionario = id_Ca__custionario;
    }
     
     
     
     
     
}
