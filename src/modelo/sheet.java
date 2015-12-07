/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import fecha.HoraFecha;
import irepots.Reporte;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jonatan Lara
 */
public class sheet {
    private ArrayList<Object> crse = new ArrayList<>();
    private ArrayList<Object> subj = new ArrayList<>();
    private ArrayList<Object> periodo = new ArrayList<>();
    private ArrayList<Object> title = new ArrayList<>();
    private ArrayList<Object> grde = new ArrayList<>();
    /*
    */
    List ListaDeDatos = new ArrayList();
    public sheet(){
    
    }
    public void setCrse(String tex){
        crse.add(tex);
    }
    public void setSubj(String tex){
        subj.add(tex);
    }
    public void setPeriodo(String tex){
        periodo.add(tex);
    }
    public void setTitle(String tex){
        title.add(tex);
    }
    public void setGrde(String tex){
        grde.add(tex);
    }
    public void comprobarRepeticiones(){
        depurar();
        for (int i = 0; i < crse.size(); i++) {
            String aux = (String) crse.get(i);
            for (int j = i+1; j < crse.size(); j++) {
                String aux2 = (String) crse.get(j);
                if (aux.equals(aux2)) {
                    crse.remove(i);
                    subj.remove(i);
                    periodo.remove(i);
                    title.remove(i);
                    grde.remove(i);
                }
            }
        }
    }
    
    public void getArray(){
        for (int i = 0; i < crse.size(); i++) {
            System.out.println(crse.get(i)+" "+subj.get(i)+" "+periodo.get(i)+" "+title.get(i)+" "+ grde.get(i));
            }
            System.out.println("total de materias modificadas sheet:"+crse.size());
    }
    public void getImpresion(){
        for (int i = 0; i < crse.size(); i++) {
            Listado listado = new Listado(subj.get(i).toString(),crse.get(i).toString(),periodo.get(i).toString(),title.get(i).toString(),grde.get(i).toString());
            ListaDeDatos.add(listado);
            
        }
    }
    public void impreso(){
        getImpresion();
        Reporte reporte = new Reporte();
        HoraFecha fecha = new HoraFecha();
        reporte.generarReporte("00210404", "Jonata lara", 
                "Lisi", "activo",fecha.getFecha()
                , ListaDeDatos);
    }
    private void depurar(){
        for (int i = 0; i < subj.size(); i++) {
            String aux = (String) subj.get(i);
                if (aux.equals("LENG")){
                    subj.remove(i);
                    crse.remove(i);
                    periodo.remove(i);
                    title.remove(i);
                    grde.remove(i);
                }
                if (aux.equals("TPEE")) {
                    subj.remove(i);
                    crse.remove(i);
                    periodo.remove(i);
                    title.remove(i);
                    grde.remove(i);
                }
                if (aux.equals("TPEG")) {
                    subj.remove(i);
                    crse.remove(i);
                    periodo.remove(i);
                    title.remove(i);
                    grde.remove(i);
                }
                if (aux.equals("CIAN")) {
                    subj.remove(i);
                    crse.remove(i);
                    periodo.remove(i);
                    title.remove(i);
                    grde.remove(i);
                }
                if (aux.length()==0) {
                    subj.remove(i);
                    crse.remove(i);
                    periodo.remove(i);
                    title.remove(i);
                    grde.remove(i);
                }
         
        } 
    }
}   
