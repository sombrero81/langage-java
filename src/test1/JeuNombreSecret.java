/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.DataInputStream;
import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuNombreSecret {

    public static void main(String[] args) throws IOException {

        double nombreSecretDecimal = Math.random() * 100 + 1;
        int nombreSecret = (int) nombreSecretDecimal;
        //System.out.println(nombreSecretDecimal);
        // System.out.println(nombreSecret);
        /**
         * premiere facon de faire*
         */

        int nombreSecret2 = MathUtil.calculerNombreAleatoire();
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
