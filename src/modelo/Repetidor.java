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
public class Repetidor {
       // Texto
        //String sTexto = "palabra o palabra y palabra";
        // Texto que vamos a buscar
        //String sTextoBuscado = "palabra";
         // Contador de ocurrencias 
        int contador ;    
        public Repetidor(){
        contador = 0;
        }
        
        public void Comprobar(String sTexto,String sTextoBuscado){
            
            while (sTexto.indexOf(sTextoBuscado) > -1) {
              sTexto = sTexto.substring(sTexto.indexOf(
              sTextoBuscado)+sTextoBuscado.length(),sTexto.length());
              contador++; 
             }
            //System.out.println(contador);
            
        }
        public int getTotalCont(){
            return contador;
        }

           //System.out.println (contador);

        

}


