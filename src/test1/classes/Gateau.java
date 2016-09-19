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
public class Gateau {

    private static String forme = "etoile";
    private String gout;
    private String couleur;
    private static int var = 0;

    public Gateau(String gout, String couleur) { //constructeur
        this.gout = gout;
        this.couleur = couleur;
        var = var + 1;
    }

    public Gateau() { //constructeur

        this.couleur = "noir";
        this.gout = "chocolat";
        var = var + 1;
    }

    public static int getVar() {
        return var;
    }

    public static void setVar(int var) {
        Gateau.var = var;
    }

    public static String getForme() {
        return forme;
    }

    public static void setForme(String forme) {
        Gateau.forme = forme;
    }

    public String getGout() {
        return gout;
    }

    public void setGout(String gout) {
        this.gout = gout;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {

        return var + " " + forme + " *** " + gout + " ***" + couleur; //ce qui renvoi un objet vers string
    }
}
