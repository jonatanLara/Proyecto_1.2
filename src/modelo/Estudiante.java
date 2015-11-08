/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo; 

/**
 *
 * @author Jonatan Lara
 */

public class Estudiante {

    private String nombre;
    private String id;
    private String prog;
    private String estatus;

    public Estudiante() {
    }

    /**
     *
     * @author Jonatan Lara
     * @param nombre
     * @param id
     * @param prog
     * @param estatus
     */
    public Estudiante(String nombre, String id, String prog, String estatus) {
        this.nombre = nombre;
        this.id = id;
        this.prog = prog;
        this.estatus = estatus;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the prog
     */
    public String getProg() {
        return prog;
    }

    /**
     * @param prog the prog to set
     */
    public void setProg(String prog) {
        this.prog = prog;
    }

    /**
     * @return the estatus
     */
    public String getEstatus() {
        return estatus;
    }

    /**
     * @param estatus the estatus to set
     */
    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

}
