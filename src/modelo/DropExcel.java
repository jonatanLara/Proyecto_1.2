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
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import vista.Email;
import vista.ViewPrincipal;

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
    private Repetidor1 repetidor1 = new Repetidor1();
    private Calificaciones calificaciones = new Calificaciones();
    //-----------------------------------------------
    
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
                                ViewPrincipal principal = new ViewPrincipal();
                                principal.readLine(true);
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
    public void leerDatos(){
        for (int i = 0; i < jtable.getRowCount(); i++) {
            subj.add(tableModel.getValueAt(i, 7).toString());
            crse.add(tableModel.getValueAt(i, 8).toString());
            title.add(tableModel.getValueAt(i, 10).toString());
            grde.add(tableModel.getValueAt(i, 22).toString());
        }
        
        Subj();
        Crse();
    }
    public void Subj(){
        for (int i = 0; i < subj.size(); i++) {
            String aux = (String) subj.get(i);
            String auxtitulo = (String) title.get(i);
            
           if (aux.equals("LENG")){
                subj.remove(i);
                crse.remove(i);
                title.remove(i);
                grde.remove(i);
            }
            if (aux.equals("TPEE")) {
                subj.remove(i);
                crse.remove(i);
                title.remove(i);
                grde.remove(i);
            }
            if (aux.equals("TPEG")) {
                subj.remove(i);
                crse.remove(i);
                title.remove(i);
                grde.remove(i);
            }
            if (aux.equals("CIAN")) {
                subj.remove(i);
                crse.remove(i);
                title.remove(i);
                grde.remove(i);
            }
            
        } System.out.println("subj "+"crse "+" titile "+"grde ");
        for (int i = 0; i <subj.size(); i++) {
            System.out.println(subj.get(i)+" "+crse.get(i)+" "+title.get(i)+" "+grde.get(i));
        }
    }
    public void Crse(){
        for (int i = 0; i < crse.size(); i++) {
            String aux = (String) crse.get(i);
            repetidor1.Comprobar(aux);
            //System.out.println(aux);
            String cal = (String)grde.get(i);
            calificaciones.Comprobar(aux, cal);
            System.out.println(aux+" "+ title.get(i)+" "+cal);
        }
        impresionDatos();
        
    }
    public void impresion(){
        leerDatos();
        id();
        nombre();
        prog();
        estatus();
        Reporte reporte = new Reporte();
        HoraFecha fecha = new HoraFecha();
        reporte.generarReporte(estudiante.getId(), estudiante.getNombre(),
                estudiante.getProg(), estudiante.getEstatus(),fecha.getFecha(),
                repetidor1.convertidor(repetidor1.getC001()),repetidor1.convertidor(repetidor1.getMa01()),repetidor1.convertidor(repetidor1.getIn01()),repetidor1.convertidor(repetidor1.getMa06()),repetidor1.convertidor(repetidor1.getVa01()),
                repetidor1.convertidor(repetidor1.getSs06()),repetidor1.convertidor(repetidor1.getSs01()),repetidor1.convertidor(repetidor1.getSs07()),repetidor1.convertidor(repetidor1.getSs03()),repetidor1.convertidor(repetidor1.getVa04()),
                repetidor1.convertidor(repetidor1.getMa02()),repetidor1.convertidor(repetidor1.getSs05()),repetidor1.convertidor(repetidor1.getSs02()),repetidor1.convertidor(repetidor1.getSs04()),repetidor1.convertidor(repetidor1.getVa03()),
                repetidor1.convertidor(repetidor1.getSs09()),repetidor1.convertidor(repetidor1.getSs21()),repetidor1.convertidor(repetidor1.getSs11()),repetidor1.convertidor(repetidor1.getMa03()),repetidor1.convertidor(repetidor1.getVa02()),
                repetidor1.convertidor(repetidor1.getSs08()),repetidor1.convertidor(repetidor1.getSs12()),repetidor1.convertidor(repetidor1.getSs10()),repetidor1.convertidor(repetidor1.getAd23()),repetidor1.convertidor(repetidor1.getIv02()),repetidor1.convertidor(repetidor1.getEe01()),
                repetidor1.convertidor(repetidor1.getSs13()),repetidor1.convertidor(repetidor1.getSs15()),repetidor1.convertidor(repetidor1.getSs18()),repetidor1.convertidor(repetidor1.getSs14()),repetidor1.convertidor(repetidor1.getRh02()),repetidor1.convertidor(repetidor1.getVa05()),
                repetidor1.convertidor(repetidor1.getSs20()),repetidor1.convertidor(repetidor1.getSs17()),repetidor1.convertidor(repetidor1.getCm01()),repetidor1.convertidor(repetidor1.getCo02()),repetidor1.convertidor(repetidor1.getDe51()),repetidor1.convertidor(repetidor1.getAd13()),
                repetidor1.convertidor(repetidor1.getSs19()),repetidor1.convertidor(repetidor1.getSs16()),repetidor1.convertidor(repetidor1.getIv03()),repetidor1.convertidor(repetidor1.getRh03()),repetidor1.convertidor(repetidor1.getAd22()),repetidor1.convertidor(repetidor1.getIv01()),
                calificaciones.getC001(),calificaciones.getMa01(),calificaciones.getIn01(),calificaciones.getMa06(),calificaciones.getVa01(),
                calificaciones.getSs06(),calificaciones.getSs01(),calificaciones.getSs07(),calificaciones.getSs03(),calificaciones.getVa04(),
                calificaciones.getMa02(),calificaciones.getSs05(),calificaciones.getSs02(),calificaciones.getSs04(),calificaciones.getVa03(),
                calificaciones.getSs09(),calificaciones.getSs21(),calificaciones.getSs11(),calificaciones.getMa03(),calificaciones.getVa02(),
                calificaciones.getSs08(),calificaciones.getSs12(),calificaciones.getSs10(),calificaciones.getAd23(),calificaciones.getIv02(),calificaciones.getEe01(),
                calificaciones.getSs13(),calificaciones.getSs15(),calificaciones.getSs18(),calificaciones.getSs14(),calificaciones.getRh02(),calificaciones.getVa05(),
                calificaciones.getSs20(),calificaciones.getSs17(),calificaciones.getCm01(),calificaciones.getCo02(),calificaciones.getDe51(),calificaciones.getAd13(),
                calificaciones.getSs19(),calificaciones.getSs16(),calificaciones.getIv03(),calificaciones.getRh03(),calificaciones.getAd22(),calificaciones.getIv01());
    }
    public void impresionDatos(){
       /* System.out.println(repetidor1.getCo02());System.out.println(repetidor1.getMa01());System.out.println(repetidor1.getIn01());System.out.println(repetidor1.getMa06());System.out.println(repetidor1.getVa01());
        System.out.println(repetidor1.getSs06());System.out.println(repetidor1.getSs01());System.out.println(repetidor1.getSs07());System.out.println(repetidor1.getSs03());System.out.println(repetidor1.getVa04());
        System.out.println(repetidor1.getMa02());System.out.println(repetidor1.getSs05());System.out.println(repetidor1.getSs02());System.out.println(repetidor1.getSs04());System.out.println(repetidor1.getVa03());
        System.out.println(repetidor1.getSs09());System.out.println(repetidor1.getSs21());System.out.println(repetidor1.getSs11());System.out.println(repetidor1.getMa03());System.out.println(repetidor1.getVa02());
        System.out.println(repetidor1.getSs08());System.out.println(repetidor1.getSs12());System.out.println(repetidor1.getSs10());System.out.println(repetidor1.getAd23());System.out.println(repetidor1.getIv02());System.out.println(repetidor1.getEe01());
        System.out.println(repetidor1.getSs13());System.out.println(repetidor1.getSs15());System.out.println(repetidor1.getSs18());System.out.println(repetidor1.getSs14());System.out.println(repetidor1.getRh02());System.out.println(repetidor1.getVa05());
        System.out.println(repetidor1.getSs20());System.out.println(repetidor1.getSs17());System.out.println(repetidor1.getCm01());System.out.println(repetidor1.getCo02());System.out.println(repetidor1.getDe51());System.out.println(repetidor1.getAd13());
        System.out.println(repetidor1.getSs19());System.out.println(repetidor1.getSs16());System.out.println(repetidor1.getIv03());System.out.println(repetidor1.getRh03());System.out.println(repetidor1.getAd22());System.out.println(repetidor1.getIv01());
       */ 
        System.out.println(calificaciones.getEe01());
    }
    
}
