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
public class Film {
    
    
    private String titre;
    private String synopsis;
    private Integer dureeEnMinutes;
    private Integer annee;
    private static int nbfilm = 0;

    public Film(String titre, String synopsis, Integer dureeEnMinutes, Integer annee) {
        this.titre = titre;
        this.synopsis = synopsis;
        this.dureeEnMinutes = dureeEnMinutes;
        this.annee = annee;
        nbfilm++;
    }

    public Film() {
        this("","",0,0);
    }

    public static int getNbfilm() {
        return nbfilm;
    }

    
    
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public Integer getDureeEnMinutes() {
        return dureeEnMinutes;
    }

    public void setDureeEnMinutes(Integer dureeEnMinutes) {
        this.dureeEnMinutes = dureeEnMinutes;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    @Override
    public String toString() {
        return titre+" "+synopsis+" "+annee+" "+dureeEnMinutes; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
