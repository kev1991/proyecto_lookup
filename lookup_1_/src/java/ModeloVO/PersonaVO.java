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
public class PersonaVO {
    
    // #1 crear variables 
	 private String id_persona,per_nombre,per_segundo_nombre,per_apellido,per_segundo_apellido,per_tipo_documento,per_numero_documento,per_fecha_nacimiento,per_email,per_email_corporativo,per_cargo; 
         
    // #2 crear constructor vacio para que reciva datos
    public PersonaVO() {
    }
         
         
    // #3 crear constructor
    public PersonaVO(String id_persona, String per_nombre, String per_segundo_nombre, String per_apellido, String per_segundo_apellido, String per_tipo_documento, String per_numero_documento, String per_fecha_nacimiento, String per_email, String per_email_corporativo, String per_cargo) {
        this.id_persona = id_persona;
        this.per_nombre = per_nombre;
        this.per_segundo_nombre = per_segundo_nombre;
        this.per_apellido = per_apellido;
        this.per_segundo_apellido = per_segundo_apellido;
        this.per_tipo_documento = per_tipo_documento;
        this.per_numero_documento = per_numero_documento;
        this.per_fecha_nacimiento = per_fecha_nacimiento;
        this.per_email = per_email;
        this.per_email_corporativo = per_email_corporativo;
        this.per_cargo = per_cargo;
    }

         
         // #4 crear getter y setter
    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_segundo_nombre() {
        return per_segundo_nombre;
    }

    public void setPer_segundo_nombre(String per_segundo_nombre) {
        this.per_segundo_nombre = per_segundo_nombre;
    }

    public String getPer_apellido() {
        return per_apellido;
    }

    public void setPer_apellido(String per_apellido) {
        this.per_apellido = per_apellido;
    }

    public String getPer_segundo_apellido() {
        return per_segundo_apellido;
    }

    public void setPer_segundo_apellido(String per_segundo_apellido) {
        this.per_segundo_apellido = per_segundo_apellido;
    }

    public String getPer_tipo_documento() {
        return per_tipo_documento;
    }

    public void setPer_tipo_documento(String per_tipo_documento) {
        this.per_tipo_documento = per_tipo_documento;
    }

    public String getPer_numero_documento() {
        return per_numero_documento;
    }

    public void setPer_numero_documento(String per_numero_documento) {
        this.per_numero_documento = per_numero_documento;
    }

    public String getPer_fecha_nacimiento() {
        return per_fecha_nacimiento;
    }

    public void setPer_fecha_nacimiento(String per_fecha_nacimiento) {
        this.per_fecha_nacimiento = per_fecha_nacimiento;
    }

    public String getPer_email() {
        return per_email;
    }

    public void setPer_email(String per_email) {
        this.per_email = per_email;
    }

    public String getPer_email_corporativo() {
        return per_email_corporativo;
    }

    public void setPer_email_corporativo(String per_email_corporativo) {
        this.per_email_corporativo = per_email_corporativo;
    }

    public String getPer_cargo() {
        return per_cargo;
    }

    public void setPer_cargo(String per_cargo) {
        this.per_cargo = per_cargo;
    }
}
