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
public class Listado {
  /*Variables que estan dentro del arry*/
    private String subj;
    private String crse;
    private String periodo;
    private String title;
    private String grde;
    
    private String numReperidos;

    public Listado() {
    }

    public Listado(String subj, String crse, String periodo, String title, String grde) {
        this.subj = subj;
        this.crse = crse;
        this.periodo = periodo;
        this.title = title;
        this.grde = grde;
    //    this.numReperidos = numReperidos;
    }

    /**
     * @return the subj
     */
    public String getSubj() {
        return subj;
    }
    /**
     * @param subj the subj to set
     */
    public void setSubj(String subj) {
        this.subj = subj;
    }

    /**
     * @return the crse
     */
    public String getCrse() {
        return crse;
    }

    /**
     * @param crse the crse to set
     */
    public void setCrse(String crse) {
        this.crse = crse;
    }

    /**
     * @return the periodo
     */
    public String getPeriodo() {
        return periodo;
    }

    /**
     * @param periodo the periodo to set
     */
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the grde
     */
    public String getGrde() {
        return grde;
    }

    /**
     * @param grde the grde to set
     */
    public void setGrde(String grde) {
        this.grde = grde;
    }

    /**
     * @return the numReperidos
     */
    public String getNumReperidos() {
        return numReperidos;
    }

    /**
     * @param numReperidos the numReperidos to set
     */
    public void setNumReperidos(String numReperidos) {
        this.numReperidos = numReperidos;
    }
    
}
