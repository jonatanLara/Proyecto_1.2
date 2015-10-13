/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notify;


import java.awt.Toolkit;
import nicon.notify.core.Notification;

/**
 *
 * @author Jonatan Lara
 */
public class Notify {
    /*
    private void look(){
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Notify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
    public Notify(){}
   
    public void notifyAlert(String titulo,String mensaje){
            
            Notification.show(titulo, mensaje, Notification.NICON_DARK_THEME, Notification.WIFI_ICON);
            Toolkit.getDefaultToolkit().beep();
    }
    public void notifyConection(String titulo,String mensaje){
          
            Notification.show(titulo, mensaje, Notification.NICON_DARK_THEME, Notification.WIFI_ICON);
            Toolkit.getDefaultToolkit().beep();
    }
}
