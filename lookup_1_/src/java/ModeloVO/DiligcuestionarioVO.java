/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloVO;

/**
 *
 * @author Sena
 */
public class DiligcuestionarioVO {
    // #1 crear variables 
    public String id_diligenciamiento_cuestionario, dili_concentimiento_BRP, dili_is_active, dili_fecha_aplicacin, id_usuario, id_cuestionario;
    
// #2 crear constructor vacio para que reciva datos
    public DiligcuestionarioVO() {
    }
    
     // #3 crear constructor
    public DiligcuestionarioVO(String id_diligenciamiento_cuestionario, String dili_concentimiento_BRP, String dili_is_active, String dili_fecha_aplicacin, String id_usuario, String id_cuestionario) {
        this.id_diligenciamiento_cuestionario = id_diligenciamiento_cuestionario;
        this.dili_concentimiento_BRP = dili_concentimiento_BRP;
        this.dili_is_active = dili_is_active;
        this.dili_fecha_aplicacin = dili_fecha_aplicacin;
        this.id_usuario = id_usuario;
        this.id_cuestionario = id_cuestionario;
    }
    
    
// #4 crear getter y setter
    public String getId_diligenciamiento_cuestionario() {
        return id_diligenciamiento_cuestionario;
    }

    public void setId_diligenciamiento_cuestionario(String id_diligenciamiento_cuestionario) {
        this.id_diligenciamiento_cuestionario = id_diligenciamiento_cuestionario;
    }

    public String getDili_concentimiento_BRP() {
        return dili_concentimiento_BRP;
    }

    public void setDili_concentimiento_BRP(String dili_concentimiento_BRP) {
        this.dili_concentimiento_BRP = dili_concentimiento_BRP;
    }

    public String getDili_is_active() {
        return dili_is_active;
    }

    public void setDili_is_active(String dili_is_active) {
        this.dili_is_active = dili_is_active;
    }

    public String getDili_fecha_aplicacin() {
        return dili_fecha_aplicacin;
    }

    public void setDili_fecha_aplicacin(String dili_fecha_aplicacin) {
        this.dili_fecha_aplicacin = dili_fecha_aplicacin;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getId_cuestionario() {
        return id_cuestionario;
    }

    public void setId_cuestionario(String id_cuestionario) {
        this.id_cuestionario = id_cuestionario;
    }
}
