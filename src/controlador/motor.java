/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import org.jvnet.substance.SubstanceLookAndFeel;
import vista.ViewPrincipal;

/**
 *
 * @author Jonatan Lara
 */
public class motor {
    public static void main(String[] args) {
        ViewPrincipal principal = new ViewPrincipal();
        try{
        principal.setDefaultLookAndFeelDecorated(true);
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.RavenGraphiteGlassSkin");
        principal.setVisible(true);
        }catch(Exception e){
        }
        
    }
   
}
