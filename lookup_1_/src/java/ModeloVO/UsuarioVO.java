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
public class UsuarioVO {
    // definir variables
     private String id_usuario, user_name, user_password, user_is_active, id_persona, id_perfil;

    public UsuarioVO(String user_name) {
        this.user_name = user_name;
    }

    public UsuarioVO() {
    }

    public UsuarioVO(String id_usuario, String user_name, String user_password, String user_is_active, String id_persona, String id_perfil) {
        this.id_usuario = id_usuario;
        this.user_name = user_name;
        this.user_password = user_password;
        this.user_is_active = user_is_active;
        this.id_persona = id_persona;
        this.id_perfil = id_perfil;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_is_active() {
        return user_is_active;
    }

    public void setUser_is_active(String user_is_active) {
        this.user_is_active = user_is_active;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(String id_perfil) {
        this.id_perfil = id_perfil;
    }
}
