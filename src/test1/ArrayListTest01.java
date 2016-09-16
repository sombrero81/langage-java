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
public class ArrayListTest01 {
    
    public static void main(String[] args) {
        
        //creation des 2 listes
        //syntsaxe diamond pour donner le type de la liste
        ArrayList<String> liste1 =new ArrayList<>();
        ArrayList<String> liste2 =new ArrayList<>();
        ArrayList<Integer> asupprimer =new ArrayList<>();
        
        //creation de la liste mixte
        ArrayList listemixte =new ArrayList();
        
        
        liste1.add("michel");
        liste1.add("albert");
        liste1.add("david");
        liste1.add("xavier");
        liste1.add("martin");
        
        System.out.println("liste1");
        System.out.println(liste1);
        
        liste2.add("martine");
        liste2.add("simone");
        liste2.add("chrstine");
        liste2.add("sara");
        liste2.add("martin");
        liste2.add("ludivine");
        
        System.out.println("liste2");
        System.out.println(liste2);
        
        for(int i2=0; i2<liste2.size();i2++){
            
           liste1.add( liste2.get(i2));     
                    
        }
        
        System.out.println("liste1");
        System.out.println(liste1);
        
        
         //remplir la liste à supprimer
        //afficher la 1ere liste
        int i=0;
        while (i<10) {            
            asupprimer.add(i);
            i=i+1;
        }
        System.out.println("asupprimer");
        System.out.println(asupprimer);
        
        listemixte.add("A");
        listemixte.add("albert");
        listemixte.add("B");
        listemixte.add("C");
        listemixte.add(1);
        listemixte.add("True");
        listemixte.add("coucou");
        listemixte.add(4);
        listemixte.add(5);
        listemixte.add(6);
        
        System.out.println("listemixte");
        System.out.println(listemixte);
        
        
        //je supprime les elements de la a supprimer de la mixte
        listemixte.removeAll(asupprimer);
        
        System.out.println("listemixte");
        System.out.println(listemixte);
        
        
    }
    
}
