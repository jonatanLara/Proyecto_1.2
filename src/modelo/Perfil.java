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
public class Perfil {
    private String nombre;
    private String Licenciatura;
    
    public Perfil(){
    }

    public Perfil(String nombre, String Licenciatura) {
        this.nombre = nombre;
        this.Licenciatura = Licenciatura;
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
     * @return the Licenciatura
     */
    public String getLicenciatura() {
        return Licenciatura;
    }

    /**
     * @param Licenciatura the Licenciatura to set
     */
    public void setLicenciatura(String Licenciatura) {
        this.Licenciatura = Licenciatura;
    }
}
