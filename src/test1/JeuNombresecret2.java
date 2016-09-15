/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuNombresecret2 {
    
    public static void main(String[] args) throws IOException {
        
        String txtmin = ConsoleUtil.lireTexte("donnez le min");
        int nombreMin = Integer.valueOf(txtmin);

        String txtmax = ConsoleUtil.lireTexte("donnez le max");
        int nombreMax = Integer.valueOf(txtmax);
        
        int nombreSecret2 = MathUtil.calculerNombreAleatoire(nombreMin, nombreMax);
        //System.out.println(nombreSecret2);
        int nombre;
        int temp = 0;
        String score;

        do {

            String txt = ConsoleUtil.lireTexte("proposez un nombre entier entre 0 et 100 :");
            nombre = Integer.valueOf(txt);
            temp = temp + 1; //temp ++ pour incrementer et temp -- pour decrementer

            if (nombreSecret2 == nombre) {

            } else if (nombreSecret2 > nombre) {
                System.out.println("ce nombre est plus petit");

            } else {
                System.out.println("ce nombre est plus grand");
            }

        } while (nombre != nombreSecret2);
    }
    
}
