/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Email.Email;
import Login.Login;
import background.background;
import conectar.conexion;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import modelo.DropExcel;
import modelo.Perfil;
import perfil.Profile;

/**
 *
 * @author Jonatan Lara
 */
public class ViewPrincipal extends javax.swing.JFrame {
     
    private final background fondo = new background("Unid_conecta.png");
    private final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel barra_fondo = new JLabel(new ImageIcon(getClass().getResource("/icons/barra_fondo.png")));
    TablaExcel tabla= new TablaExcel();
    conexion conectar = new conexion();
    JPopupMenu menu;
    JMenuItem m1,m2,m3,m4,m5;
    Perfil perfil;
    public String link = "http://www.google.com.mx";
    public ViewPrincipal() {
        setContentPane(fondo);
        initComponents();
        Panel.setBackground(new Color(0, 0, 0, 5));
        sizeWindows();
        HiloCargarDB hilo = new HiloCargarDB();
        hilo.start();
        iconoAplication();
        lbConexion.setEnabled(false);
        btGuardar.setEnabled(false);
        btBuscar.setEnabled(false);
        barra_fondo.setBounds(0, 0,1366, 50);
        jPanel1.add("Center", barra_fondo);
        sesion();
        Colsulata();
        System.out.println("El id de arranque es "+ getID());
        
    }
    public ViewPrincipal(String id){
        setContentPane(fondo);
        initComponents();
        this.idusuario = id;
        Panel.setBackground(new Color(0, 0, 0, 5));
        sizeWindows();
        HiloCargarDB hilo = new HiloCargarDB();
        hilo.start();
        iconoAplication();
        lbConexion.setEnabled(false);
        btGuardar.setEnabled(false);
        btBuscar.setEnabled(false);
        barra_fondo.setBounds(0, 0,1366, 50);
        jPanel1.add("Center", barra_fondo);
        sesion();
        System.out.println("El id de arranque es "+getID());
        DropExcel drop = new DropExcel(getID());
    }
    public void sesion(){
        Colsulata();
         // Create a JPopupMenu
        menu=new JPopupMenu();
        
        // Create JMenuItems
            m1=new JMenuItem(perfil.getNombre());
            m1.setBackground(new Color(0,102,102));
            m1.setForeground(Color.WHITE);
            m1.setIcon(new ImageIcon(getClass().getResource("/icons/silhouette16.png")));
            m2=new JMenuItem(perfil.getLicenciatura());
            m2.setBackground(new Color(0,102,102));
            m2.setForeground(Color.WHITE);
            m2.setIcon(new ImageIcon(getClass().getResource("/icons/portfolio25.png")));
            m3=new JMenuItem("Configurar");
            m3.setBackground(new Color(0,102,102));
            m3.setForeground(Color.WHITE);
            m3.setIcon(new ImageIcon(getClass().getResource("/icons/nut4.png")));
            m3.setCursor(new Cursor(Cursor.HAND_CURSOR));
            m4=new JMenuItem("Acerca de");
            m4.setBackground(new Color(0,102,102));
            m4.setForeground(Color.WHITE);
            m4.setIcon(new ImageIcon(getClass().getResource("/icons/information.png")));
            m4.setCursor(new Cursor(Cursor.HAND_CURSOR));
            m5=new JMenuItem("Desconectar");
            m5.setBackground(new Color(0,102,102));
            m5.setForeground(Color.WHITE);
            m5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        // Add JMenuItems to JPopupMenu
        menu.add(m1);
        menu.add(m2);
        menu.add(m3);
        menu.add(m4);
        menu.add(m5);
        jButton1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 showPopup(e);
            }
        });
        m3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Profile profile = new Profile(null, true,getID());
               profile.setVisible(true);
            }
        });
        m4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(null, "Version de java 8.1");
            }
        });
        m5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               Login login = new Login();
               login.setVisible(true);
               conectar.Desconectar();
               dispose();
            }
        });
        
    }
    private void Colsulata(){
        //String slq ="SELECT nombre, licenciatura FROM usuarios INNER JOIN licenciatura ON usuarios.licenciaturas_id = licenciatura.licenciatura_id WHERE usuario_id =";
        conectar.conectar();
        Statement st = conectar.getStatement();
        perfil = new Perfil();
        String txt;
        try {
            ResultSet r = st.executeQuery("SELECT nombre, licenciatura FROM usuarios INNER JOIN licenciatura ON usuarios.licenciaturas_id = licenciatura.licenciatura_id WHERE usuario_id ="+getID());
             if (r != null) {
                r.next();
                System.out.println(r.getString("nombre"));
                perfil.setNombre(r.getString("nombre"));
                perfil.setLicenciatura(r.getString("licenciatura"));
            }
            else{
                System.out.println("No se encontro");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void showPopup(ActionEvent ae)
    {
        
        Component b=(Component)ae.getSource();
        Point p=b.getLocationOnScreen();
        menu.show(this,0,0);
        menu.setLocation(p.x,p.y+b.getHeight());
    }
    String idusuario;
    JLabel idlabel;
    public void idUsiario(String id){
       idlabel = new JLabel(id);
       this.idusuario = id;
    }
    public String getID(){
        return idusuario;
    }
    public void sizeWindows(){
        System.out.println("tu resolucion es " + screenSize.width + "x" + screenSize.height);
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
    public void iconoAplication(){
        try {
            setIconImage(new ImageIcon(getClass().getResource("/icons/IconUnid.png")).getImage());
            
        } catch (Exception e) {
        } 
    }
    /* para abrir pagina web*/
    public void abrirLink(){
         try {
             Desktop.getDesktop().browse(new URI(link));
         } catch (Exception e) {
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

        Panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btNuevo = new javax.swing.JButton();
        btRefresh = new javax.swing.JButton();
        btImprimir = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btEmail = new javax.swing.JButton();
        btPag = new javax.swing.JButton();
        btBuscar = new javax.swing.JButton();
        lbConexion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 359, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(636, 40));

        btNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document298 (1).png"))); // NOI18N
        btNuevo.setToolTipText("Nuevo*");
        btNuevo.setBorderPainted(false);
        btNuevo.setContentAreaFilled(false);
        btNuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btNuevo.setFocusable(false);
        btNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btNuevo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/document298.png"))); // NOI18N
        btNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh85 (1).png"))); // NOI18N
        btRefresh.setToolTipText("Recargar");
        btRefresh.setBorderPainted(false);
        btRefresh.setContentAreaFilled(false);
        btRefresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btRefresh.setFocusable(false);
        btRefresh.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btRefresh.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        btRefresh.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRefreshActionPerformed(evt);
            }
        });

        btImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper6.png"))); // NOI18N
        btImprimir.setToolTipText("Imprimir");
        btImprimir.setBorderPainted(false);
        btImprimir.setContentAreaFilled(false);
        btImprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btImprimir.setFocusable(false);
        btImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btImprimir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/paper6 (1).png"))); // NOI18N
        btImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        btGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save31.png"))); // NOI18N
        btGuardar.setToolTipText("Guardar");
        btGuardar.setBorderPainted(false);
        btGuardar.setContentAreaFilled(false);
        btGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btGuardar.setFocusable(false);
        btGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save31 (1).png"))); // NOI18N
        btGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/envelope91 (1).png"))); // NOI18N
        btEmail.setToolTipText("Email");
        btEmail.setBorderPainted(false);
        btEmail.setContentAreaFilled(false);
        btEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEmail.setFocusable(false);
        btEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEmail.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/envelope91.png"))); // NOI18N
        btEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmailActionPerformed(evt);
            }
        });

        btPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/international38.png"))); // NOI18N
        btPag.setToolTipText("Navegador");
        btPag.setBorderPainted(false);
        btPag.setContentAreaFilled(false);
        btPag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPag.setFocusable(false);
        btPag.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPag.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/international38 (1).png"))); // NOI18N
        btPag.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPagActionPerformed(evt);
            }
        });

        btBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/looking (1).png"))); // NOI18N
        btBuscar.setToolTipText("Buscar");
        btBuscar.setBorderPainted(false);
        btBuscar.setContentAreaFilled(false);
        btBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        lbConexion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bus_verde.png"))); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/silhouette78.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btPag, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbConexion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPag, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbConexion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    
  
    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        Panel.removeAll();
        InicioPanel();
        
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPagActionPerformed
        abrirLink();
    }//GEN-LAST:event_btPagActionPerformed
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
                /*JFrame.setDefaultLookAndFeelDecorated(true);
                SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.BusinessBlackSteelSkin");*/
                //new ViewPrincipal().setVisible(true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbConexion;
    // End of variables declaration//GEN-END:variables
}
