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
public class Serpent extends Reptile {

    
    public Serpent(){
        this.nom = "Serpent";
    }
    
    @Override
    public void manger() {
        System.out.println("je mange");
    }

    @Override
    public void bouger() {
        System.out.println("je rampe");

    }

}
