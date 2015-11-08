/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar;

import Notify.Notify;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;

/**
 *
 * @author Jonatan Lara
 */
public class conexion {

    public String bd = "Academico_LISI";
    public String login = "root";
    public String password = "";
    public String url = "jdbc:mysql://localhost/" + bd;
    Connection conn;
    private Notify notify = new Notify();
    public Statement conectar() {
        conn = null;
        Statement st = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                notify.notifyConection("Conexion ", "Conexion exitosa",true);
                st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                
        }
        } catch (SQLException ex) {
            String er="se produjo un problema al conectar con la base de datos";
            notify.notifyConection("Conexion", er,false);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            
        }
        return st;
    }
    public Statement conectar(JLabel lb) {
        conn = null;
        Statement st = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, password);
            if (conn != null) {
                notify.notifyConection("Conexion ", "Conexion exitosa",true);
                st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                lb.setEnabled(true);
                lb.setToolTipText("Conexion Activada");
                isEmpyConection = true;
        }
        } catch (SQLException ex) {
            String er="se produjo un problema al conectar con la base de datos";
            notify.notifyConection("Conexion", er,false);
            lb.setEnabled(false);
            isEmpyConection= false;
            lb.setToolTipText("No conectado");
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
            lb.setEnabled(false);
            isEmpyConection = false;
        }
        return st;
    }
    
    public Connection getConectar(){
        return conn;
    
    }
    
    boolean isEmpyConection;
    public boolean isEmpyConexion(){
           return isEmpyConection;
    }
}
