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
public class CategoriCuestionarioVO {

    // #1 crear variables 
    private String id_Ca__custionario, nombre_custionario;

    // #2 crear constructor vacio para que reciva datos
    public CategoriCuestionarioVO() {
    }
    
     // #3 crear constructor
    public CategoriCuestionarioVO(String id_Ca__custionario, String nombre_custionario) {
        this.id_Ca__custionario = id_Ca__custionario;
        this.nombre_custionario = nombre_custionario;
    }
    
    // #4 crear getter y setter
    public String getId_Ca__custionario() {
        return id_Ca__custionario;
    }

    public void setId_Ca__custionario(String id_Ca__custionario) {
        this.id_Ca__custionario = id_Ca__custionario;
    }

    public String getNombre_custionario() {
        return nombre_custionario;
    }

    public void setNombre_custionario(String nombre_custionario) {
        this.nombre_custionario = nombre_custionario;
    }
}
