/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;

/**
 *
 * @author admin
 */
public class NombreAleatoireMinMax {

    public static void main(String[] args) throws IOException {

        String txtmin = ConsoleUtil.lireTexte("donnez le min");
        int nombreMin = Integer.valueOf(txtmin);

        String txtmax = ConsoleUtil.lireTexte("donnez le max");
        int nombreMax = Integer.valueOf(txtmax);

        int nombreGenere;
        do {
            double nombreDecimal = Math.random() * nombreMax + 1;
            nombreGenere = (int) nombreDecimal;
            System.out.println(nombreGenere);
        } while (nombreGenere < nombreMin );

        System.out.println(nombreGenere);
    }

}
