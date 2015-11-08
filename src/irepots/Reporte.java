/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irepots;

import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Jonatan Lara
 */
public class Reporte {
    public Reporte(){}
    public void generarReporte(String id,String nombre, String prog, String estatus,String fecha,
            String n_co01,String n_ma01,String n_in01,String n_ma06,String n_va01,
            String n_ss06,String n_ss01,String n_ss07,String n_ss03,String n_va04,
            String n_ma02,String n_ss05,String n_ss02,String n_ss04,String n_va03,
            String n_ss09,String n_ss21,String n_ss11,String n_ma03,String n_va02,
            String n_ss08,String n_ss12,String n_ss10,String n_ad23,String n_iv02,String n_ee01,
            String n_ss13,String n_ss15,String n_ss18,String n_ss14,String n_rh02,String n_va05,
            String n_ss20,String n_ss17,String n_cm01,String n_co02,String n_de51,String n_ad13,
            String n_ss19,String n_ss16,String n_iv03,String n_rh03,String n_ad22,String n_iv01,
            String g_co01,String g_ma01,String g_in01,String g_ma06,String g_va01,
            String g_ss06,String g_ss01,String g_ss07,String g_ss03,String g_va04,
            String g_ma02,String g_ss05,String g_ss02,String g_ss04,String g_va03,
            String g_ss09,String g_ss21,String g_ss11,String g_ma03,String g_va02,
            String g_ss08,String g_ss12,String g_ss10,String g_ad23,String g_iv02,String g_ee01,
            String g_ss13,String g_ss15,String g_ss18,String g_ss14,String g_rh02,String g_va05,
            String g_ss20,String g_ss17,String g_cm01,String g_co02,String g_de51,String g_ad13,
            String g_ss19,String g_ss16,String g_iv03,String g_rh03,String g_ad22,String g_iv01){
       JasperReport reporte;
       JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("Report.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            Map parametros = new HashMap();
            parametros.put("id", id);
            parametros.put("nombre", nombre);
            parametros.put("prog", prog);
            parametros.put("estatus", estatus);
            parametros.put("fecha", fecha);
            parametros.put("n_co01", n_co01);parametros.put("n_ma01", n_ma01);parametros.put("n_in01", n_in01);parametros.put("n_ma06", n_ma06);parametros.put("n_va01", n_va01);
            parametros.put("n_ss06", n_ss06);parametros.put("n_ss01", n_ss01);parametros.put("n_ss07", n_ss07);parametros.put("n_ss03", n_ss03);parametros.put("n_va04", n_va04);
            parametros.put("n_ma02", n_ma02);parametros.put("n_ss05", n_ss05);parametros.put("n_ss02", n_ss02);parametros.put("n_ss04", n_ss04);parametros.put("n_va03", n_va03);
            parametros.put("n_ss09", n_ss09);parametros.put("n_ss21", n_ss21);parametros.put("n_ss11", n_ss11);parametros.put("n_ma03", n_ma03);parametros.put("n_va02", n_va02);
            parametros.put("n_ss08", n_ss08);parametros.put("n_ss12", n_ss12);parametros.put("n_ss10", n_ss10);parametros.put("n_ad23", n_ad23);parametros.put("n_iv02", n_iv02);parametros.put("n_ee01", n_ee01);
            parametros.put("n_ss13", n_ss13);parametros.put("n_ss15", n_ss15);parametros.put("n_ss18", n_ss18);parametros.put("n_ss14", n_ss14);parametros.put("n_rh02", n_rh02);parametros.put("n_va05", n_va05);
            parametros.put("n_ss20", n_ss20);parametros.put("n_ss17", n_ss17);parametros.put("n_cm01", n_cm01);parametros.put("n_co02", n_co02);parametros.put("n_de51", n_de51);parametros.put("n_ad13", n_ad13);
            parametros.put("n_ss19", n_ss19);parametros.put("n_ss16", n_ss16);parametros.put("n_iv03", n_iv03);parametros.put("n_rh03", n_rh03);parametros.put("n_ad22", n_ad22);parametros.put("n_iv01", n_iv01);
            parametros.put("g_co01", g_co01);parametros.put("g_ma01", g_ma01);parametros.put("g_in01", g_in01);parametros.put("g_ma06", g_ma06);parametros.put("g_va01", g_va01);
            parametros.put("g_ss06", g_ss06);parametros.put("g_ss01", g_ss01);parametros.put("g_ss07", g_ss07);parametros.put("g_ss03", g_ss03);parametros.put("g_va04", g_va04);
            parametros.put("g_ma02", g_ma02);parametros.put("g_ss05", g_ss05);parametros.put("g_ss02", g_ss02);parametros.put("g_ss04", g_ss04);parametros.put("g_va03", g_va03);
            parametros.put("g_ss09", g_ss09);parametros.put("g_ss21", g_ss21);parametros.put("g_ss11", g_ss11);parametros.put("g_ma03", g_ma03);parametros.put("g_va02", g_va02);
            parametros.put("g_ss08", g_ss08);parametros.put("g_ss12", g_ss12);parametros.put("g_ss10", g_ss10);parametros.put("g_ad23", g_ad23);parametros.put("g_iv02", g_iv02);parametros.put("g_ee01", g_ee01);
            parametros.put("g_ss13", g_ss13);parametros.put("g_ss15", g_ss15);parametros.put("g_ss18", g_ss18);parametros.put("g_ss14", g_ss14);parametros.put("g_rh02", g_rh02);parametros.put("g_va05", g_va05);
            parametros.put("g_ss20", g_ss20);parametros.put("g_ss17", g_ss17);parametros.put("g_cm01", g_cm01);parametros.put("g_co02", g_co02);parametros.put("g_de51", g_de51);parametros.put("g_ad13", g_ad13);
            parametros.put("g_ss19", g_ss19);parametros.put("g_ss16", g_ss16);parametros.put("g_iv03", g_iv03);parametros.put("g_rh03", g_rh03);parametros.put("g_ad22", g_ad22);parametros.put("g_iv01", g_iv01);
            reporte_view = JasperFillManager.fillReport(reporte, parametros,new JREmptyDataSource());
            JasperViewer view = new JasperViewer(reporte_view, false);
            view.setTitle(nombre);
            view.setVisible(true);
         } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void generarReporte(String id,String nombre, String prog, String estatus,String fecha, Collection listMateria){
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("reporteTab.jasper");
            reporte = (JasperReport) JRLoader.loadObject(in);
            Map parametros = new HashMap();
            parametros.put("id", id);
            parametros.put("nombre", nombre);
            parametros.put("prog", prog);
            parametros.put("estatus", estatus);
            parametros.put("fecha", fecha);
            reporte_view = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(listMateria));
            JasperViewer view = new JasperViewer(reporte_view, false);
            view.setTitle(nombre);
            view.setVisible(true);
         } catch (JRException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
        
}
