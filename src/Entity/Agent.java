/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author jbuffeteau
 */
public class Agent 
{
    
    private ArrayList <Agent> lesAgents;
    private String numAgent;
    private String nomAgent;
    private String prenomAgent;
    private Agent unAgent;
    public Agent ()
    {
        
    }
    
  public Agent(String unNum, String unNom, String unPrenom)
    {
      numAgent = unNum;
      nomAgent = unNom;
      prenomAgent = unPrenom;
    }

    public String getNumAgent()
    {
        return numAgent;
    }
       
       
    

    public void setNumAgent(String numAgent) {
        this.numAgent = numAgent;
        
    }

    public String getNomAgent() {
        return nomAgent;
        
    }

    public void setNomAgent(String nomAgent) {
        this.nomAgent= nomAgent;
        
    }

 
    public ArrayList<Agent> getLesAgents() {
        return lesAgents;
    }
    
    public void ajouter()
           
    {
      lesAgents.add(unAgent);  
    }

    /**
     * @param lesAgents the lesActivites to set
     */
    public void setLesAgents(ArrayList <Agent> lesAgents) {
        this.lesAgents= lesAgents;
    }

    /**
     * @return the unLib
     */
    public String getPrenomAgent() {
        return prenomAgent;
    }

    /**
     * @param unLib the unLib to set
     */
    public void setUnPrenom(String unPrenom) {
        this.prenomAgent = unPrenom;
    }
}
