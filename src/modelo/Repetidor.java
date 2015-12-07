/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Jonatan Lara
 */
public class Repetidor {
    
    private ArrayList<String> datos= new ArrayList();
    public Repetidor(){
    }
    public void setIngresar(String txt){
        datos.add(txt);
    }
    public void comprobar(){
        for (int i = 0; i < datos.size(); i++) {
            String aux = datos.get(i);
            for (int j = i+1; j < datos.size(); j++) {
                String aux2 = datos.get(j);
                if (aux.equals(aux2)) {
                    datos.remove(i);
                }
            }
        }
    }
    
    public void getArray(){
        for (int i = 0; i < datos.size(); i++) {
            System.out.println(""+datos.get(i));
            
        }
        System.out.println("total de materias modificadas :"+datos.size());
    }
}
