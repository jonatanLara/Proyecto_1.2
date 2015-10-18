/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notify;


import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import nicon.notify.core.Notification;

/**
 *
 * @author Jonatan Lara
 */
public class Notify {
    
    public short Wifi =Notification.WIFI_ICON;
    public short Alarma = Notification.ALARM_ICON;
    public short calendario = Notification.CALENDAR_ICON;
    public short goole = Notification.GOOGLE_ICON;
    public short advertencia = Notification.WARNING_MESSAGE;
    public short facebook =Notification.FACEBOOK_ICON;
    public short twitter = Notification.TWITTER_ON_ICON;
    public short actualizar = Notification.UPDATE_ICON_BLUE;
    public short error = Notification.ERROR_MESSAGE;
    public short Correcto = Notification.OK_MESSAGE;
    
    private void look(){
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Notify.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public Notify(){}
   
    public void notifyAlert(String titulo,String mensaje, short notificacion){
            
            Notification.show(titulo, mensaje, Notification.NICON_DARK_THEME, notificacion);
            Toolkit.getDefaultToolkit().beep();
    }
    public void notifyConection(String titulo,String mensaje,short notificacion){
          
            Notification.show(titulo, mensaje, Notification.NICON_DARK_THEME, notificacion);
            Toolkit.getDefaultToolkit().beep();
    }
    public void notificacionPrediseñada(){
            
    }
    
        
    
}
