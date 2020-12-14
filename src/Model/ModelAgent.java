/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Activite;
import Entity.Agent;
import Entity.AgentPresent;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jbuffeteau
 */
public class ModelAgent extends AbstractTableModel
{
    private String[] nomsColonnes = {"Numéro", "Nom", "Prénom"};
    private Vector<Object[]> rows;

    @Override
    public int getRowCount()
    {
        return rows.size();
    }

    @Override
    public int getColumnCount() 
    {
        return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        return rows.get(rowIndex)[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return nomsColonnes[column]; 
    }
    @Override
    public void setValueAt(Object value, int row, int column) {
        rows.get(row)[column] = value;
  }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 3;
    }
    
    @Override
    public Class getColumnClass(int columnIndex) {
        return rows.get(0)[columnIndex].getClass();
    }
    
    public void loadDatas(ArrayList<Agent> lesAgents)
    {
      nomsColonnes = new String[]{"Numéro", "Nom","Prénom"};
        rows = new Vector<>();
        for (Agent a : lesAgents)
        {
           
          rows.add(new String[]{String.valueOf(a.getNumAgent()),a.getNomAgent() ,a.getPrenomAgent()}); 
        }
        
        fireTableChanged(null);
       
        
        
        
    }
    public void loadDatasPresence(ArrayList<AgentPresent> lesAgentPresent)
    {
        
         nomsColonnes = new String[]{"Numéro", "Nom","Prénom","Prénom","Présence"};
        rows = new Vector<>();
        for (AgentPresent a : lesAgentPresent)
        {
           
          rows.add(new String[]{String.valueOf(a.getNumAgentPresent()),a.getNomAgentPresent() ,a.getPrenomAgentPresent()}); 
        }
        
        fireTableChanged(null);
       
        
    }

}
   
       
    

