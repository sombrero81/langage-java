/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Acteur;
import test1.classes.Film;
import test1.classes.Genre;

/**
 *
 * @author admin
 */
public class FilmTest {

    @Test
    public void test2() {

        Film f1 = new Film("dracula", "bla bla bla", 120, 1936);
        System.out.println(f1);
        System.out.println(Film.getNbfilm());

        Film f2 = new Film("frankenstein", "bla  bla", 140, 1925);
        System.out.println(f2);
        System.out.println(Film.getNbfilm());

        Acteur a1 = new Acteur("john", "doe");
        System.out.println(a1);
        System.out.println(Acteur.getNbacteur());
        
        Genre g1 = new Genre("horreur");
        System.out.println(g1);
        System.out.println(Genre.getNbgenre());
        
        

    }

}
