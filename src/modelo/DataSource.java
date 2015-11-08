/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRField;

/**
 *
 * @author Jonatan Lara
 */
public class DataSource implements JRDataSource {

    private List<Listado> listaMateria = new ArrayList<Listado>();
    private int indiceMateriaActual = -1;

    @Override
    public boolean next() throws JRException {
        return ++indiceMateriaActual < listaMateria.size();
    }

    @Override
    public Object getFieldValue(JRField jrf) throws JRException {
        Object valor = null;

        if ("subj".equals(jrf.getName())) {
            valor = listaMateria.get(indiceMateriaActual).getSubj();
        } 
        else if ("crse".equals(jrf.getName())) {
            valor = listaMateria.get(indiceMateriaActual).getCrse();
        }
        else if ("periodo".equals(jrf.getName())) {
            valor = listaMateria.get(indiceMateriaActual).getPeriodo();
        }
        else if ("title".equals(jrf.getName())) {
            valor = listaMateria.get(indiceMateriaActual).getTitle();
        }
        else if ("grde".equals(jrf.getName())) {
            valor = listaMateria.get(indiceMateriaActual).getGrde();
        }

        return valor;
    }

    public void addParticipante(Listado materia) {
        this.listaMateria.add(materia);
    }
}
