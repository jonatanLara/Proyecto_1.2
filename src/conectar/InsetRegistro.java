/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectar;

import com.mysql.jdbc.Statement;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonatan Lara
 */
public class InsetRegistro {
    conexion conectar = new conexion();
    public InsetRegistro(){
        //conectar.conectar();
    }
    public int InsertRegistro(String tabla,Object[] datos){
        int Row=0;
        try {
            Connection con  = conectar.conctarDB();
            String CadenaInsert="insert into "+tabla+" values ("+"'"+datos[0]+"'";
            for (int i = 1; i <= datos.length; i++) {
                if (i < datos.length) {
                    CadenaInsert+=",'"+datos[i]+"'";
                }else
                    CadenaInsert+=")";
                
                }
                  //JOptionPane.showMessageDialog(null, CadenaInsert);
                  Statement SentenciaInsert = (Statement) con.createStatement();
                  //Statement SentenciaInsert = (Statement) conectar.getStatement();
                  Row = SentenciaInsert.executeUpdate(CadenaInsert);
                  System.out.println("Almacenado Correctamente en la tabla "+tabla+"!");
            
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error al enviar los datos");
        }
        return Row;
    }
}
