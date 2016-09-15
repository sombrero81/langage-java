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
        
        ArrayList<Integer> liste1 =new ArrayList<>();
        ArrayList<Integer> liste2 =new ArrayList<>();
        ArrayList<Integer> liste3 =new ArrayList<>();
        
        int i=10;
        while (i<101) {            
            liste1.add(i);
            i=i+10;
        }
        
        System.out.println(liste1);
        
    }
    
}
