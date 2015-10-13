/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import background.background;
import conectar.conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import org.jvnet.substance.SubstanceLookAndFeel;

/**
 *
 * @author Jonatan Lara
 */
public class ViewPrincipal extends javax.swing.JFrame {
     
    private final background fondo = new background("Unid_conecta.png");
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    TablaExcel tabla= new TablaExcel();;
    conexion conectar = new conexion();
    public ViewPrincipal() {
        setContentPane(fondo);
        initComponents();
        Panel.setBackground(new Color(0, 0, 0, 5));
        sizeWindows();
        HiloCargarDB hilo = new HiloCargarDB();
        hilo.start();
        lbConexion.setEnabled(false);
        btGuardar.setEnabled(false);
        btBuscar.setEnabled(false);
    }
    public void sizeWindows(){
       // System.out.println("tu resolucion es " + screenSize.width + "x" + screenSize.height);
        this.setSize(screenSize.width, screenSize.height);
        
    }
    private void conetarDB(){
        conectar.conectar(lbConexion);
        if (conectar.isEmpyConexion()!=true) {
            btGuardar.setEnabled(false);
            btBuscar.setEnabled(false);
        }else{
            btGuardar.setEnabled(true);
            btBuscar.setEnabled(true);
        }
        
    }
    
    public void InicioPanel(){
        int W = Panel.getWidth();
        int H = Panel.getHeight();
        Panel.setLayout(new BorderLayout());
        tabla.setPreferredSize(new Dimension(W, H));
        Panel.add("Center",tabla);
        Panel.updateUI();
        Panel.validate();
    }
    private class HiloCargarDB extends Thread {
          @Override
          public void run() {
            try {
                // ESPERO 1 SEG 
                Thread.sleep(2500);
            } catch (InterruptedException ex) {
                 Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            conetarDB();
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btNuevo = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btEmail = new javax.swing.JButton();
        btPag = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        lbConexion = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document298 (1).png"))); // NOI18N
        btNuevo.setToolTipText("Nuevo*");
        btNuevo.setBorderPainted(false);
        btNuevo.setContentAreaFilled(false);
        btNuevo.setFocusable(false);
        btNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document298.png"))); // NOI18N
        btNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btNuevo);

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh85 (1).png"))); // NOI18N
        btRefresh.setToolTipText("Recargar");
        btRefresh.setBorderPainted(false);
        btRefresh.setContentAreaFilled(false);
        btRefresh.setFocusable(false);
        btRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRefresh.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        btRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });
        jToolBar1.add(btRefresh);

        btImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper6.png"))); // NOI18N
        btImprimir.setToolTipText("Imprimir");
        btImprimir.setBorderPainted(false);
        btImprimir.setContentAreaFilled(false);
        btImprimir.setFocusable(false);
        btImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper6 (1).png"))); // NOI18N
        btImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });
        jToolBar1.add(btImprimir);

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save31.png"))); // NOI18N
        btGuardar.setToolTipText("Guardar");
        btGuardar.setBorderPainted(false);
        btGuardar.setContentAreaFilled(false);
        btGuardar.setFocusable(false);
        btGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save31 (1).png"))); // NOI18N
        btGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });
        jToolBar1.add(btGuardar);

        btEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/envelope91 (1).png"))); // NOI18N
        btEmail.setToolTipText("Email");
        btEmail.setBorderPainted(false);
        btEmail.setContentAreaFilled(false);
        btEmail.setFocusable(false);
        btEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEmail.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/envelope91.png"))); // NOI18N
        btEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmailActionPerformed(evt);
            }
        });
        jToolBar1.add(btEmail);

        btPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/international38.png"))); // NOI18N
        btPag.setToolTipText("Navegador");
        btPag.setBorderPainted(false);
        btPag.setContentAreaFilled(false);
        btPag.setFocusable(false);
        btPag.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPag.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/international38 (1).png"))); // NOI18N
        btPag.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btPag);

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/looking (1).png"))); // NOI18N
        btBuscar.setToolTipText("Buscar");
        btBuscar.setBorderPainted(false);
        btBuscar.setContentAreaFilled(false);
        btBuscar.setFocusPainted(false);
        btBuscar.setFocusable(false);
        btBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/looking.png"))); // NOI18N
        btBuscar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });
        jToolBar1.add(btBuscar);

        lbConexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bus_verde.png"))); // NOI18N
        jToolBar1.add(lbConexion);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void readLine(boolean read){
        /*
        btImprimir.setEnabled(read);
        btGuardar.setEnabled(read);*/
    }
    
    public void Enabledfalse(){
        /*btGuardar.setEnabled(false);
        btImprimir.setEnabled(false);*/
    }
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        Panel.removeAll();
        InicioPanel();
        Enabledfalse();
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRefreshActionPerformed
        InicioPanel();
        
    }//GEN-LAST:event_btRefreshActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
      tabla.datos();
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
       tabla.impresion();
    }//GEN-LAST:event_btImprimirActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        Panel.removeAll();
        search();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmailActionPerformed
        Email email  = new  Email(this, true);
        email.setVisible(true);
    }//GEN-LAST:event_btEmailActionPerformed
    public void search(){
        Search search = new Search();
        int W = Panel.getWidth();
        int H = Panel.getHeight();
        Panel.setLayout(new BorderLayout());
        search.setPreferredSize(new Dimension(W, H));
        Panel.add("Center",search);
        Panel.updateUI();
        Panel.validate();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btEmail;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btPag;
    private javax.swing.JButton btRefresh;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbConexion;
    // End of variables declaration//GEN-END:variables
}
