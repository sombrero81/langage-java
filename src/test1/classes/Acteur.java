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
public class Acteur {
    
    private String nom;
    private String prenom;
    private static int nbacteur=0;

    public Acteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        nbacteur++;
    }

    public Acteur() {
        this("","");
    }

    public static int getNbacteur() {
        return nbacteur;
    }
    
    
    
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return nom+" "+ prenom; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
