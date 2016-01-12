/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar;

import java.sql.Statement;

/**
 *
 * @author Jonatan Lara
 */
public class Insertar {
    private conexion con = new conexion();
    public Insertar(){
        con.conectar();
    }
    public void insertarAlumno(String matricula,String nombre,String Programa,String estatus){
        try {
            String sql = "INSERT INTO alumnos VALUES(NULL,'"+matricula+"','"+nombre+"','"+Programa+"','"+estatus+"'"+")";
            Statement sentencia  = con.getStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    public void insertarAsignaturas(String subj,String curse,String periodo,String titulo){
        try {
            String sql = "INSERT INTO asignaturas VALUES(NULL,'"+subj+"','"+curse+"','"+periodo+"','"+titulo+"'"+")";
            Statement sentencia  = con.getStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
    public void insertarCalificacion(String calificacion){
        try {
            String sql = "INSERT INTO calificacion VALUES(NULL,'"+calificacion+"'"+")";
            Statement sentencia  = con.getStatement();
            sentencia.executeUpdate(sql);
        } catch (Exception e) {
            System.out.println(e);
        }
    
    }
}
