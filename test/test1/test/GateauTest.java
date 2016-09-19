/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Gateau;

/**
 *
 * @author admin
 */
public class GateauTest {

    @Test
    public void test2(){
        
    }
    
    @Test
    public void monTest() {

       // Gateau.setForme("lune");
                
        Gateau g1 = new Gateau();
        g1.setGout("chocolat");
        
        System.out.println(g1);
        
        Gateau g2 = new Gateau();
        g2.setGout("chocolat");
        
        System.out.println(g2);
        
        Gateau g3 = new Gateau();
        g3.setGout("citron");
        
        System.out.println(g3);
        
    }

}
