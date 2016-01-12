
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
    private ArrayList<Object> fecha = new ArrayList<>();
    
    List ListaDeDatos = new ArrayList();
    private int totalDeMateria = 0;
    private int MateriasRepetidas = 0;
    private int materiasValidas=0;
    
    public sheet() {

    }

    public void setCrse(String tex) {
        crse.add(tex);
    }

    public void setSubj(String tex) {
        subj.add(tex);
    }

    public void setPeriodo(String tex) {
        periodo.add(tex);
    }

    public void setTitle(String tex) {
        title.add(tex);
    }

    public void setGrde(String tex) {
        grde.add(tex);
    }

    public void setFecha(String tex) {
        fecha.add(tex);
    }

    public void comprobarRepeticiones() {
        depurar();
        for (int i = 0; i < crse.size(); i++) {
            String aux = (String) crse.get(i);
            for (int j = i + 1; j < crse.size(); j++) {
                String aux2 = (String) crse.get(j);
                if (aux.equals(aux2)) {
                    crse.remove(i);
                    subj.remove(i);
                    periodo.remove(i);
                    title.remove(i);
                    grde.remove(i);
                    fecha.remove(i);
                    MateriasRepetidas++;
                }
            }
        }
    }

    /**
     *
     * @author Jonatan Lara
     * devuelve el arreglo en el siguiente orden crse, subj, periodo, titile, grde y fecha.
     * asi como el el tamaño del arreglo.
     */
    public void getArray() {
        for (int i = 0; i < crse.size(); i++) {
            System.out.println(crse.get(i) + " " + subj.get(i) + " " + periodo.get(i) + " " + title.get(i) + " " + grde.get(i) + " " + fecha.get(i));
            totalDeMateria++;
        }
        System.out.println("total de materias modificadas sheet:" + crse.size());
    }
    /**
     *
     * @author Jonatan Lara
     * Almacena los siguentes datos: subj ,crse, periodo, titile, grde. En la clase Listado.
     */
    public void getImpresion() {
        for (int i = 0; i < crse.size(); i++) {
            Listado listado = new Listado(subj.get(i).toString(), crse.get(i).toString(), periodo.get(i).toString(), title.get(i).toString(), grde.get(i).toString());
            ListaDeDatos.add(listado);
            materiasValidas++;
        }
    }
    /**
     *
     * @author Jonatan Lara
     * Manda a Impresion los siguietes Datos:-- resive como parametro (String id, String nombre, String prog, String status)
     * e imprime los datos almacenados en la clase Listado
     */
    public void impreso(String id, String nombre, String prog, String status) {
        getImpresion();
        Reporte reporte = new Reporte();
        HoraFecha fecha = new HoraFecha();
        reporte.generarReporte(id, nombre,
                prog, status, fecha.getFecha(),ListaDeDatos,String.valueOf(materiasValidas*7),String.valueOf(MateriasRepetidas),String.valueOf(totalDeMateria));
    }
    
    /**
     *
     * @author Jonatan Lara
     * Hace un filtrado de los datos que No son de interes tales como:
     * LENG, TPEE,TPEG, CIAN, length() == 0.
     */
    private void depurar() {
        for (int i = 0; i < subj.size(); i++) {
            String aux = (String) subj.get(i);
            if (aux.equals("LENG")) {
                subj.remove(i);
                crse.remove(i);
                periodo.remove(i);
                title.remove(i);
                grde.remove(i);
                fecha.remove(i);
            }
            if (aux.equals("TPEE")) {
                subj.remove(i);
                crse.remove(i);
                periodo.remove(i);
                title.remove(i);
                grde.remove(i);
                fecha.remove(i);
            }
            if (aux.equals("TPEG")) {
                subj.remove(i);
                crse.remove(i);
                periodo.remove(i);
                title.remove(i);
                grde.remove(i);
                fecha.remove(i);
            }
            if (aux.equals("CIAN")) {
                subj.remove(i);
                crse.remove(i);
                periodo.remove(i);
                title.remove(i);
                grde.remove(i);
                fecha.remove(i);
            }
            if (aux.length() == 0) {
                subj.remove(i);
                crse.remove(i);
                periodo.remove(i);
                title.remove(i);
                grde.remove(i);
                fecha.remove(i);
            }

        }
    }
}
