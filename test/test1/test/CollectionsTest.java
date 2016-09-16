/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Set;


/**
 *
 * @author admin
 */
public class CollectionsTest {
    
    @Test
    public void recupRuby(){
        
        HashMap<String,String> map = new HashMap<>();
        map.put("java","langage de prog objet");
        map.put("c","langage de prog structuré");
        map.put("ruby","langage de script objet");
        
        String def = map.get("ruby");
        System.out.println(def);
        
        Integer taille = map.size();
        System.out.println(taille);
         
        
        Set<String> set1= map.keySet();
        System.out.println(set1);
        
        map.replace("ruby", "super langage");
        System.out.println(map);
        
        map.remove("c");
        System.out.println(map);
        
        HashMap<String,String> map2 = new HashMap<>();
        map2.put("php","langage de psdfsdrog objet");
        map2.put("python","langadfdfge de prog structuré");
        map.putAll(map2);
        System.out.println(map);
        
        Set<String> keySet= map.keySet();
        for(String key :keySet){
            System.out.println(key + ":" + map.get(key));
        }
        
         
    }
    
    
    @Test    
    public void map(){
        
        HashMap<String,String> map = new HashMap<>();
        
        map.put("java","langage de prog objet");
        map.put("c","langage de prog structuré");
        map.put("ruby","langage de script objet");
        
        map.size();//renvoi 3
        map.get("ruby");//renvoi "langage de script objet
        map.keySet();//renvoi un set avec java,c,ruby
        map.values();//renvoi les valeurs pas les clés
        map.putAll(map);//ajoute une map ds une autre
        map.remove("c");//supprime l'entree c de la map
        map.replace("c", "langage ancien");
        map.clear(); // vide la map
        
        
    }
    
}
