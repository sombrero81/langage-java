/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ExoListe01 {
    
    public static void main(String[] args) {
        //creation des 3 listes
        ArrayList<Integer> liste1 =new ArrayList<>();
        ArrayList<Integer> liste2 =new ArrayList<>();
        ArrayList<Integer> liste3 =new ArrayList<>();
        
        
        
        //remplir la 1 ere liste
        //afficher la 1ere liste
        int i=10;
        while (i<101) {            
            liste1.add(i);
            i=i+10;
        }
        System.out.println("liste1");
        System.out.println(liste1);
        
        
        
         //remplir la 2 eme liste
         //afficher la 2eme liste
        int j=2;
        while (j<101) {            
            liste2.add(j);
            j=j+2;
        }
        System.out.println("liste2");
        System.out.println(liste2);
        
        
        
        
         //remplir la 3 eme liste
         //afficher la 3eme liste
        int k=3;
        while (k<100) {            
            liste3.add(k);
            k=k+3;
        }
        System.out.println("liste3");
        System.out.println(liste3);
        
        
        for(int i2=0; i2<liste2.size();i2++){
            for(int i3=0; i3<liste3.size();i3++){
                if (liste2.get(i2)==liste3.get(i3)) {
                  liste2.remove(i2);  
                }
            }
        }
        System.out.println("liste2 -liste 3");
        System.out.println(liste2);
        
        
        for(int i2=0; i2<liste2.size();i2++){
            for(int i1=0; i1<liste1.size();i1++){
                if (liste2.get(i2)==liste1.get(i1)) {
                  liste2.remove(i2);  
                }
            }
        }
        System.out.println("liste2-liste3 -liste1");
        System.out.println(liste2);
        
        
    }
    
}
