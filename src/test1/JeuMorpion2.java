/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuMorpion2 {
    public static void affiche (int[][]p){
    
        for(int[] ligneAct:p){
            for(int elemAct:ligneAct){
                System.out.print(elemAct);
            }
            System.out.println("");
        }
    }
            
    public static void main(String[] args) throws IOException {
        
        int taille=3;
        int [][] plateau = new int [taille][taille];
        
        //remplissage tableau
        for(int indice2=0;indice2<plateau.length ;indice2++){
          for(int indice1=0;indice1<plateau.length ;indice1++){
            plateau[indice1][indice2]= MathUtil.calculerNombreAleatoire(0,1);
          }  
        }
        //affichage tableau
        
//        for(int indice2=0;indice2<plateau.length ;indice2++){
//          for(int indice1=0;indice1<plateau.length ;indice1++){
//            System.out.print(plateau[indice1][indice2]);
//          }  
//        } 
        
        affiche(plateau);
        
    }
    
    
}
