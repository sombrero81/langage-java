/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import test1.classes.Animal;
import test1.classes.Poisson;
import test1.classes.Serpent;
import test1.classes.Tortue;

/**
 *
 * @author admin
 */
public class AnimalTest {
    
    @Test
    public void test(){
        
        
//        Animal p = new Poisson();
       // Poisson p = new Poisson();
//        p.bouger();
//        p.manger();
        ArrayList<Animal> ListeAnimaux = new ArrayList<>();
  
        Poisson p = new Poisson();
        ListeAnimaux.add(p);
        
        Serpent s = new Serpent();
        ListeAnimaux.add(s);
        
        Tortue t = new Tortue();
        ListeAnimaux.add(t);
        
        for (Animal animal : ListeAnimaux) {
            System.out.println(animal.nom);
            
            animal.manger();
            animal.bouger();
        }
        
    
    
    }
    
    
    
}
