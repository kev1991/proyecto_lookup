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
public class PreguntaVO {
    private String id_pregunta, pre_title, pre_descripcion,pre_is_active, pre_is_multiple, pre_create_at,  id_cuestionario;

    public PreguntaVO() {
    }

    public PreguntaVO(String id_pregunta, String pre_title, String pre_descripcion, String pre_is_active, String pre_is_multiple, String pre_create_at, String id_cuestionario) {
        this.id_pregunta = id_pregunta;
        this.pre_title = pre_title;
        this.pre_descripcion = pre_descripcion;
        this.pre_is_active = pre_is_active;
        this.pre_is_multiple = pre_is_multiple;
        this.pre_create_at = pre_create_at;
        this.id_cuestionario = id_cuestionario;
    }

    public String getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(String id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getPre_title() {
        return pre_title;
    }

    public void setPre_title(String pre_title) {
        this.pre_title = pre_title;
    }

    public String getPre_descripcion() {
        return pre_descripcion;
    }

    public void setPre_descripcion(String pre_descripcion) {
        this.pre_descripcion = pre_descripcion;
    }

    public String getPre_is_active() {
        return pre_is_active;
    }

    public void setPre_is_active(String pre_is_active) {
        this.pre_is_active = pre_is_active;
    }

    public String getPre_is_multiple() {
        return pre_is_multiple;
    }

    public void setPre_is_multiple(String pre_is_multiple) {
        this.pre_is_multiple = pre_is_multiple;
    }

    public String getPre_create_at() {
        return pre_create_at;
    }

    public void setPre_create_at(String pre_create_at) {
        this.pre_create_at = pre_create_at;
    }


    public String getId_cuestionario() {
        return id_cuestionario;
    }

    public void setId_cuestionario(String id_cuestionario) {
        this.id_cuestionario = id_cuestionario;
    }
}
