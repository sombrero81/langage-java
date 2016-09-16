/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.HashSet;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class SetTest {
    
    public static void main(String[] args) {
        
        //declarer le set
        HashSet<Integer> set = new HashSet<>();
        //declarer liste
        ArrayList<Integer> liste =new ArrayList<>();
        
        set.add(1);
        set.add(2);
        set.add(3);
        
        
        System.out.println("set");
        System.out.println(set);
        
        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(3);
        liste.add(4);
        liste.add(4);
        liste.add(5);
        liste.add(6);
        liste.add(7);
        
        System.out.println("liste");
        System.out.println(liste);
        
        
        //ajouter le set dans la liste
        //liste.addAll(set);
        //System.out.println("liste");
        //System.out.println(liste);
        
        
        //ajouter la liste dans le set
        set.addAll(liste);
        System.out.println("set");
        System.out.println(set);
                
    }
    
}
