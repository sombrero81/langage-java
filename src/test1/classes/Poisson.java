/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author admin
 */
public class Poisson extends Animal{

    public Poisson() {
        this.nom = "Poisson";
    }
    
    @Override
    public void manger() {
        System.out.println("je gobe");
    }

    @Override
    public void bouger() {
        System.out.println("je nage");
    }

    @Override
    public void sleep() {
        System.out.println("je nage");
        
    }
    

            
    
}
