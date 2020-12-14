/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Activite;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author jbuffeteau
 */
public class ModelActivite extends AbstractTableModel
{
    private String[] nomsColonnes = {"Numéro", "Nom"};
    private Vector<String[]> rows;

    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return nomsColonnes[column]; 
    }
    public void loadDatas(ArrayList<Activite> lesActivites)
    {
        rows = new Vector<>();
        for (Activite a : lesActivites)
        {
            rows.add(new String[]{String.valueOf(a.getNumeroActivite()),a.getLibelleActivite()});
        }
        fireTableChanged(null); 
    }
}
