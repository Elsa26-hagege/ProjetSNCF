/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author jbuffeteau
 */

  public class Formation
{
    private int num;
     private String nom;
    
     
    private Formation laFormation;
    
    public Formation()
    {
    }
    
    public Formation(int unNum,String unNom,Formation uneFormation)
    {
       
        num = unNum;
        nom = unNom;
         
          laFormation = uneFormation;
    }

    public Formation(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the num
     */
    public int getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(int num) {
        this.num = num;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the laFormation
     */
    public Formation getLaFormation() {
        return laFormation;
    }

    /**
     * @param laFormation the laFormation to set
     */
    public void setLaFormation(Formation laFormation) {
        this.laFormation = laFormation;
    }

  
 
}
