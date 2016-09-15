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
public class Collections {
    
    public static void main(String[] args) {
        
        ArrayList<String> liste =new ArrayList<>();
        
        liste.add("salut");
        liste.add("bonjour");
        liste.add("bblabla");
        liste.add("bonjour");
        liste.add("bonj");
        
        for(String s:liste){
            System.out.println(liste);
        }
        
        for(String s:liste){
            System.out.println(s);
        }
        
        liste.remove(2);
        
        System.out.println(liste + "" +liste.size());
        
        liste.remove("salut");
        System.out.println(liste);
        
        System.out.println(liste.get(2));
    }
    
    
    
}
