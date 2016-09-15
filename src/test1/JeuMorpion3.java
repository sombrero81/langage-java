/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import static test1.JeuMorpion2.affiche;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuMorpion3 {

    //affichage de tableau 2x2 avec 2 boucles inbriqué
    public static void affiche(char[][] p) {

        for (char[] ligneAct : p) {
            for (char elemAct : ligneAct) {
                System.out.print(elemAct);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) throws IOException {

        //je declare mon plateau
        int taille = 3;
        char[][] plateau = new char[taille][taille];

        //remplissage tableau avec des points
        for (int indice2 = 0; indice2 < plateau.length; indice2++) {
            for (int indice1 = 0; indice1 < plateau.length; indice1++) {
                plateau[indice1][indice2] = '.';
            }
        }

        //affichage plateau
        affiche(plateau);

        //boucle pour les 5 tours du jeu
        for (int indice = 1; indice <= 5; indice++) {
            //joueur1 choisi ligne et colonne

            int ligne;
            int colonne;
            do {
                do {

                    String txtligne = ConsoleUtil.lireTexte("donnez la ligne entre 1 et 3: ");
                    ligne = Integer.valueOf(txtligne);

                    String txtcolonne = ConsoleUtil.lireTexte("donnez la colonne entre 1 et 3: ");
                    colonne = Integer.valueOf(txtcolonne);
                } while (ligne < 1 || ligne > 3 || colonne < 1 || colonne > 3);
            } while (plateau[ligne - 1][colonne - 1] == 'X');

            plateau[ligne - 1][colonne - 1] = 'X';

            //affichage plateau
            affiche(plateau);

            //verifier si partie gagné
            if (plateau[0][0] == 'X' && plateau[1][0] == 'X' && plateau[2][2] == 'X') {
                System.out.println("partie gagné");
            }
        }

        //joueur2 choisi ligne et colonne
        int ligne;
        int colonne;
        do {
            do {

                String txtligne = ConsoleUtil.lireTexte("donnez la ligne entre 1 et 3: ");
                ligne = Integer.valueOf(txtligne);

                String txtcolonne = ConsoleUtil.lireTexte("donnez la colonne entre 1 et 3: ");
                colonne = Integer.valueOf(txtcolonne);
            } while (ligne < 1 || ligne > 3 || colonne < 1 || colonne > 3);
        } while (plateau[ligne - 1][colonne - 1] == 'O');

        plateau[ligne - 1][colonne - 1] = 'O';

        //affichage plateau
        affiche(plateau);
    }

}


