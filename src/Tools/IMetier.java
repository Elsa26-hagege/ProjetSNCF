/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Activite;
import Entity.Agent;
import Entity.AgentPresent;
import Entity.Formation;
import java.util.ArrayList;

/**
 *
 * @author jbuffeteau
 */
public interface IMetier 
{
    public ArrayList<Activite> GetAllActivites();
    public ArrayList<Formation> GetAllFormationsByIdActivite(int idActivite);
    public ArrayList<Formation> GetAllFormations();
    public ArrayList<AgentPresent> GetAllAgentsInscritsFormation(String idFormation);
    public ArrayList<Agent> GetAllAgentsNonInscritsFormation(String idFormation);
    public void InsererInscription(String idFormation, String idAgent);
    public void ModifierPresence(String idFormation, String idAgent, boolean present);
}
