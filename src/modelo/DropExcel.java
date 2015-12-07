/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import fecha.HoraFecha;
import irepots.Reporte;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Jonatan Lara
 */
public class DropExcel  implements DropTargetListener{
    private DropTarget dt;
    private JTable jtable;
    private ArrayList<Object> subj = new ArrayList<>();
    private ArrayList<Object> crse = new ArrayList<>();
    private ArrayList<Object> periodo = new ArrayList<>();
    private ArrayList<Object> title = new ArrayList<>();
    private ArrayList<Object> grde = new ArrayList<>();
    
    //----------------------------------------------------------------------------
    private DefaultTableModel tableModel = new DefaultTableModel();
    private Estudiante estudiante = new Estudiante();
    //-----------------------------------------------
    List ListaDeDatos = new ArrayList();
    
    public DropExcel(JTable table) {
        this.jtable = table;
        dt = new DropTarget(jtable, this);
       
    }

    public DropExcel() {

    }
    
    @Override
    public void dragEnter(DropTargetDragEvent dtde) {
    }

    @Override
    public void dragOver(DropTargetDragEvent dtde) {
     }

    @Override
    public void dropActionChanged(DropTargetDragEvent dtde) {
    }

    @Override
    public void dragExit(DropTargetEvent dte) {
    }

    @Override
    public void drop(DropTargetDropEvent dtde) {
        try {

            Transferable tr = dtde.getTransferable();
            //devuelve un array de objetos de DataFavors
            DataFlavor[] flavors = tr.getTransferDataFlavors();
            if (flavors.length > 0) {
                //si existe una lista de objetos de archivos
                if (flavors[0].isFlavorJavaFileListType()) {
                    dtde.acceptDrop(DnDConstants.ACTION_COPY);
                    //obtine una list con los archivos arratrados
                    java.util.List list = (java.util.List) tr.getTransferData(flavors[0]);
                    if (!list.isEmpty()) {//abre primero el archivo
                        File file = new File(list.get(0).toString());
                        //
                        if (file.exists()) {
                            //si el archivo es igual a xls
                            if (file.getName().endsWith("xls")) {
                                //lee e importa los datos//
                                readXlS(file);
                               
                            } else {
                                JOptionPane.showMessageDialog(null, "no es un archivo compaible");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "el archivo no existe");
                        }
                    }
                    dtde.dropComplete(true);
                    //JOptionPane.showMessageDialog(null," el archivo cargo correctamente");

                    return;
                }
            }
            System.err.println("Drop fallido " + dtde);
            
            dtde.rejectDrop();
            //  }HeadlessException | UnsupportedFlavorException | IO
        } catch (Exception e) {
            System.err.println("Error en el try catch " + e.getMessage());
            dtde.rejectDrop();
           
        }
    }
    
    /**
     * @readXls resive un parametro de tipo File el cual archivo con extension
     * xls
     */
    public void readXlS(File xls) {
        try {
            //crea un libro, 
            Workbook leerExcel = Workbook.getWorkbook(xls);
            //preguntamos la cantidad de hojas o existen
            if (leerExcel.getNumberOfSheets() > 0) {//si hay por lo menos una hoja
                //obtengo la hoja
                Sheet hoja = leerExcel.getSheet(0);//<-------------------es la primera hoja de excel
                //forma el array para los nombre de las columnas
                String[] columNames = new String[hoja.getColumns()];
                //forma la matris para los datos
                Object[][] data = new String[hoja.getRows()][hoja.getColumns()];
                //recorre todas las celdas

                for (int fila = 0; fila < hoja.getRows(); fila++) {
                    for (int columna = 0; columna < hoja.getColumns(); columna++) {
                        //asigana los nombre de la columna
                        if (fila == 0) {
                            //asigna nombre de columna
                            columNames[columna] = hoja.getCell(columna, fila).getContents();//hoja.getCell(columna, fila).getContents();
                            // auxColum[columna] = columNames[columna] = hoja.getCell(columna, fila).getContents();;
                            //  strig.add(columNames[columna]);
                        } else {
                            //lee celda y coloca en el array
                            data[fila][columna] = hoja.getCell(columna, fila).getContents();
                           // strigs.add(data[fila][columna]);

                        }

                    }
                    // aqui iba antes
                    tableModel = new DefaultTableModel(data, columNames);
                    jtable.setModel(tableModel);

                    tableModel.removeRow(0);
                    // guardar();
                }

            }//HeadlessException | UnsupportedFlavorException | IO
        } catch (IOException e) {
            System.err.println("Error en el try cacth de leer el excel \n" + e.getMessage());
            JOptionPane.showMessageDialog(null, "forato no compatible \n" + e.getMessage());
        } catch (BiffException e) {
            System.err.println(e.getMessage());
        }

    }
    public DefaultTableModel getTableModel() {
        return this.tableModel;
    }

    public DropTarget getDropTarget() {
        return this.dt;
    }
    public void id(){
        if (tableModel.getColumnName(0).equals("ID")) {
            estudiante.setId((String) tableModel.getValueAt(0, 0));
        }
    }
    public void nombre(){
        if (tableModel.getColumnName(1).equals("Nombre")) {
            estudiante.setNombre((String) tableModel.getValueAt(0, 1));
        }
    }
    public void prog(){
        if (tableModel.getColumnName(3).equals("Prog")) {
            estudiante.setProg((String) tableModel.getValueAt(0, 3));
        }
    }
    public void estatus(){
        if (tableModel.getColumnName(4).equals("Estatus")) {
            estudiante.setEstatus((String) tableModel.getValueAt(0, 4));
        }
    }
   // sheet hoja = new sheet();
    public void leerDatos(){
        for (int i = 0; i < jtable.getRowCount(); i++) {
            subj.add(tableModel.getValueAt(i, 7).toString());
            crse.add(tableModel.getValueAt(i, 8).toString());
            periodo.add(tableModel.getValueAt(i, 9).toString());
            title.add(tableModel.getValueAt(i, 10).toString());
            grde.add(tableModel.getValueAt(i, 22).toString());
            /*
            hoja.setSubj(tableModel.getValueAt(i, 8).toString());
            hoja.setTitle(tableModel.getValueAt(i, 10).toString());
            hoja.setPeriodo(tableModel.getValueAt(i, 9).toString());
            hoja.setGrde(tableModel.getValueAt(i, 22).toString());
            */
        }
        //Crse();
        Subj();
    }
    
    public void Subj(){
        for (int i = 0; i < subj.size(); i++) {
            String aux = (String) subj.get(i);
           // String auxtitulo = (String) title.get(i);
            
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
                //CIAN 1 201060 Curso Inducción Alum. NI 
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
           //Crse();
        
    }
    
    public void impreDato(){
        System.out.println("subj "+"crse "+"Periodo "+" titile "+"grde ");
        
        for (int i = 0; i <subj.size(); i++) {
            System.out.println(subj.get(i)+" "+crse.get(i)+" "+periodo.get(i)+" "+title.get(i)+" "+grde.get(i));
            Listado listado = new Listado(subj.get(i).toString(),crse.get(i).toString(),periodo.get(i).toString(),title.get(i).toString(),grde.get(i).toString());
            ListaDeDatos.add(listado);
        }
        System.out.println("tamaño"+subj.size());
    }
    Periodo pt = new  Periodo();
    Repetidor rep=  new Repetidor();
    sheet hoja = new sheet();
    public void Crse(){
        for (int i = 0; i < crse.size(); i++) {
            String aux = (String) crse.get(i);
            rep.setIngresar(aux);
            hoja.setCrse(aux);
            hoja.setSubj((String)subj.get(i));
            hoja.setPeriodo((String)periodo.get(i));
            hoja.setTitle((String)title.get(i));
            hoja.setGrde((String)grde.get(i));
            String per = (String) periodo.get(i);
            pt.setPeriodo(per);
            
            for (int j = i+1; j < crse.size(); j++) {
                String aux2 =(String)crse.get(j);
                
                if (aux.equals(aux2)) {
                    subj.remove(i);
                    crse.remove(i);
                    periodo.remove(i);
                    title.remove(i);
                    grde.remove(i);
                }else{
                    
                }
            }
            
        }
      //impresionDatos();
        pt.desordenado();
        pt.ordenar();
        //System.out.println(pt.getPeriodos());
        rep.comprobar();
        rep.getArray();
        
        hoja.comprobarRepeticiones();
        hoja.getArray();
        
        impreDato();
    }
    public void impresion(){
        leerDatos();
        Crse();
        /*id();
        nombre();
        prog();
        estatus();
        */
        hoja.impreso();
    }
   
}
