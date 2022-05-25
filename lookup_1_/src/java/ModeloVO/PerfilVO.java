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
public class PerfilVO {
    // #1 crear variables
     private String id_perfil, nombre;

    public PerfilVO() {
    }

    public PerfilVO(String id_perfil, String nombre) {
        this.id_perfil = id_perfil;
        this.nombre = nombre;
    }

    public String getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(String id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getPerfil() {
        return nombre;
    }

    public void setPerfil(String perfil) {
        this.nombre = perfil;
    }

   
     
}
