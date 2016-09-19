/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
public class Genre {
    
    private String nom;
    
    private static int nbgenre;

    /**
     * Get the value of nbgenre
     *
     * @return the value of nbgenre
     */
    public static int getNbgenre() {
        return nbgenre;
    }


    public Genre(String nom) {
        this.nom = nom;
        nbgenre++;
    }

    public Genre() {
        this("");
    }
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
