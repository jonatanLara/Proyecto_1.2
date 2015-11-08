/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Jonatan Lara
 */
public class Periodo {
    private int periodo;
    private ArrayList<Integer> array= new ArrayList();
    public Periodo(){
        periodo=0;
    }
    public void setPeriodo(String periodo){
        int n = Integer.parseInt(periodo);
        array.add(n);
    }
    /**
     *  Muestra el primer dato de manera ordenada
     * @return el primer dato que se encuentra en el arraList
     */
    public int ordenar(){
        int n = 0;
        Collections.sort(array);
        n = array.get(0);
        System.out.println(n);
        return n;
        
    }
    /**
     *  Muestra el primer dato de manera tal como ingresan
     * @return el primer dato que se encuentra en el arraList
     */
    public int desordenado(){
        int n;
        n=array.get(0);
        System.out.println(n);
        return n;
    }
    /**
     *  Me perimite contar cuantos periodos tiene actulmente
     *  @return el numero de periodos diferentes en total
     */
    public int Diferentes(){
        int n=1;
        int x = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            int y =array.get(i);
            if (x==y) {
                System.out.println("yes!!"+y);
              }else{
                System.out.println("don't"+y);
                x=array.get(i);
                n++;
            }
            
        }
        
        return n;
    }
}
