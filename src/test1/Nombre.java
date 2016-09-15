/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class Nombre {
    
    public static String lireTexte(String message) throws IOException{
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.println(message);
        String texte = clavier.readLine();
        return texte;
    }
    
    public static void main(String[] args) throws IOException {
        
        String txt= lireTexte("veuillez entrer un nombre entier :");
        System.out.println(txt);
        
    }
    
    
}
