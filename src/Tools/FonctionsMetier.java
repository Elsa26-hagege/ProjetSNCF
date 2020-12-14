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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jbuffeteau
 */
public class FonctionsMetier implements IMetier
{

    @Override
    public ArrayList<Activite> GetAllActivites()
    {
        ArrayList<Activite> lesActivites = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select numero, libelle from activite");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Activite a = new Activite(rs.getInt("numero"), rs.getString("libelle"));
                lesActivites.add(a);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesActivites;
    }

    @Override
    public ArrayList<Formation> GetAllFormationsByIdActivite(int idActivite)
    {
        ArrayList<Formation> lesFormations = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select code , intitule from formation where numeroActivite = "+idActivite);
            ResultSet rs = ps.executeQuery();
               {
                Formation f = new Formation(rs.getString("code"), rs.getString("intitule"));
                lesFormations.add(f);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesFormations;    
    }

    @Override
    public ArrayList<AgentPresent> GetAllAgentsInscritsFormation(String idFormation)
    {
        ArrayList<AgentPresent> lesAgentPresent = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select , ncode,nom, prenom,presence from agent, inscription where code=codeAgent and numeroFormation = '"+idFormation + "'");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                AgentPresent a = new AgentPresent(rs.getString("code"), rs.getString("nom"),rs.getString("prenom"),rs.getBoolean("presence"));
                lesAgentPresent.add(a);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesAgentPresent;    
    }

    @Override
    public ArrayList<Agent> GetAllAgentsNonInscritsFormation(String idFormation)
    {
        ArrayList<Agent> lesAgents = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select code, nom, prenom from agent where code not in (select codeAgent from inscription where numeroFormation = '"+idFormation + "')");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Agent a = new Agent(rs.getString("code"), rs.getString("nom"),rs.getString("prenom"));
                lesAgents.add(a);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesAgents;   
    }

    @Override
    public void InsererInscription(String idFormation, String idAgent) 
    {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("insert into inscription values('"+idFormation+"','"+idAgent+"',0)");
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex); 
        }
    }

    @Override
    public void ModifierPresence(String idFormation, String idAgent, boolean present)
    {
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps;
            if(present)
            {
                ps = cnx.prepareStatement("update inscription set presence = 1 where numeroFormation='"+idFormation+"' and codeAgent = '"+idAgent+"'");
            }
            else
            {
                ps = cnx.prepareStatement("update inscription set presence = 0 where numeroFormation='"+idFormation+"' and codeAgent = '"+idAgent+"'");
            }
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ArrayList<Formation> GetAllFormations()
    {
        ArrayList<Formation> lesFormations = new ArrayList<>();
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select code, intitule from formation");
            ResultSet rs = ps.executeQuery();
            while (rs.next())
            {
                Formation form = new Formation(rs.getString("code"), rs.getString("intitule"));
                lesFormations.add(form);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lesFormations;   
    }
}