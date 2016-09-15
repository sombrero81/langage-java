/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.DataInputStream;
import java.io.IOException;
import test1.util.ConsoleUtil;
import test1.util.MathUtil;



/**
 *
 * @author admin
 */
public class FonctionCarre {
    
    
    
    public static void main(String[] args) throws IOException{
        
        String txt= ConsoleUtil.lireTexte("veuillez entrer un nombre entier :");
        int nombre=Integer.valueOf(txt);
        int nombreaucarre =MathUtil.carre(nombre);
        
        System.out.println("le carre de" + nombre + " est" + nombreaucarre);
        
        
    }
    
}

