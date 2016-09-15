/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.IOException;


/**
 *comment
 * @author admin
 */
public class MathUtil {
    
    public static int factorielleRecursive(int nombre){
        if (nombre<0){
           throw new RuntimeException("erreur mathematique!");
        }
        if (nombre<=1){
            return 1;
        }
        //nombre>1
        return nombre*factorielleRecursive(nombre-1);
    }
    
    public static int factorielle(int nombre){
        if (nombre<0){
           throw new RuntimeException("erreur mathematique!");
        }
        int res=nombre;
        while (nombre>1){
            res =res *(nombre-1);
            nombre--;
        }
     return res;
    }
    
    public static int exposant(int nombre,int puissance){
        
        if (puissance<=0)
            return 1;
        //puisance>0
        
        int resultat = nombre;
        
        while (puissance>1){
            resultat = resultat * nombre;
            puissance--;
        }
        
        return resultat;
    }
    
    public static int carre(int n) {
        int c = n * n;
        return c;
    }

    public static int calculerNombreAleatoire( ) {
        double nombreSecretDecimal = Math.random() * 100 + 1;
        int nombreSecret = (int) nombreSecretDecimal;

        return nombreSecret;

    }
    
    public static int calculerNombreAleatoire(int nombreMin, int nombreMax) throws IOException{
        
        
        if (nombreMin>=nombreMax)
            throw new RuntimeException("message d'erreur min >max ");

        int nombreGenere;
        do {
            double nombreDecimal = (int) Math.random() * (nombreMax-nombreMin+1) + nombreMin ;
            nombreGenere = (int) nombreDecimal;
            //System.out.println(nombreGenere);
        } while (nombreGenere < nombreMin || nombreGenere > nombreMax);

        return nombreGenere;
    }
            
}
