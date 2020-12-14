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
public class AgentPresent
{
private ArrayList <AgentPresent> lesAgentsPresents;
    private int numAgentPresent;
    private String nomAgentPresent;
    private String prenomAgentPresent;
    private AgentPresent leAgentPresent;
    private boolean  presence;
   
    public AgentPresent(){
        
    }

    
    public AgentPresent(int unNum, String unNom, String unPrenom,AgentPresent unAgentPresent,  boolean unePresence)
    {
      numAgentPresent = unNum;
      nomAgentPresent = unNom;
      prenomAgentPresent = unPrenom;
      presence = unePresence;
    
    }

    public AgentPresent(String string, String string0, String string1, boolean aBoolean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getNumAgentPresent()
    {
        return numAgentPresent;
    }
       
       
    

    public void setNumAgentPrsent(int numAgentPresent) {
        this.numAgentPresent = numAgentPresent;
        
    }

    public String getNomAgentPresent() {
        return nomAgentPresent;
        
    }

    public void setNomAgentPresent(String nomAgentPresent) {
        this.nomAgentPresent= nomAgentPresent;
        
    }

 
    public ArrayList<AgentPresent> getLesAgentsPresents() {
     return  lesAgentsPresents; 
    }
    
    public void ajouter()
           
    {
      lesAgentsPresents.add(leAgentPresent);  
    }

    /**
     * @param lesAgents the lesActivites to set
     */
    public void setLesAgentsPresents(ArrayList <Agent> lesAgents) {
        this.lesAgentsPresents= lesAgentsPresents;
    }

    /**
     * @return the unLib
     */
    public String getPrenomAgentPresent() {
        return prenomAgentPresent;
    }

    /**
     * @param unLib the unLib to set
     */
    public void setUnPrenomAgentPresent(String unPrenom) {
        this.prenomAgentPresent = unPrenom;
    }
}
