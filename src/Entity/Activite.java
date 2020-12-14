/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

/**
 *
 * @author jbuffeteau
 */
public class Activite
{
     private int numeroActivite;
    private String libelleActivite;
    private ArrayList<Activite> lesActivites;
    
    
public Activite()
{
}
 public Activite(int unNum, String unLib)
    {
        numeroActivite = unNum;
        libelleActivite = unLib;
        
        lesActivites = new ArrayList<>();
    }

    /**
     * @return the numeroActivite
     */
    public int getNumeroActivite() {
        return numeroActivite;
    }

    /**
     * @param numeroActivite the numeroActivite to set
     */
    public void setNumeroActivite(int numeroActivite) {
        this.numeroActivite = numeroActivite;
    }

    /**
     * @return the libelleActivite
     */
    public String getLibelleActivite() {
        return libelleActivite;
    }

    /**
     * @param libelleActivite the libelleActivite to set
     */
    public void setLibelleActivite(String libelleActivite) {
        this.libelleActivite = libelleActivite;
    }

    /**
     * @return the lesActivites
     */
    public ArrayList<Activite> getLesActivites() {
        return lesActivites;
    }

    /**
     * @param lesActivites the lesActivites to set
     */
    public void setLesActivites(ArrayList<Activite> lesActivites) {
        this.lesActivites = lesActivites;
    }

 public void ajouterActivite(Activite uneActivite)
    {
        lesActivites.add(uneActivite);
    }




}
