/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author admin
 */
public class ForeachEtTableaux {
    public static void main(String[] args) {
        
        int [][] plateau = new int [3][3];
        int []tab= new int [10];
       // System.out.println(tab[0]);
       // System.out.println(tab[1]);
        //System.out.println(tab[2]);
        
        
        //lecture seulement
        for(int elemAct:tab){
            elemAct=1;
        }
        
        //je remplit manuellement la valeur
        tab [1]=3;
        
        
        //affiche tableau
        for(int elem:tab){
            System.out.println(elem);
        }
        
        
        //remplissage du tableau
        for(int indice=0;indice<tab.length ;indice++){
            tab[indice]=indice+1;
        }
        
        //affiche tableau
        for(int elem:tab){
            System.out.println(elem);
        }
        
        
    }
}
