/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c4;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author utente
 */
public class Rubrica implements Iterable<Namekey>{
   public static HashMap <Namekey,Contatto> rubrica;

    public Rubrica() {
        rubrica = new HashMap<Namekey,Contatto>();
    }
   
   public void addContatto(Namekey namekey,Contatto contatto) {
       rubrica.put(namekey, contatto);
   }
   
   public boolean modify(Namekey namekey,Contatto contatto) {
       if(!rubrica.containsKey(namekey))
           return false;
       rubrica.replace(namekey, contatto);
       return true;
   }
   
   public boolean elimina(Namekey namekey) {
        if(!rubrica.containsKey(namekey))
           return false;
        rubrica.remove(namekey);
        return true;
   }

    @Override
    public Iterator<Namekey> iterator() {
        return new Rubiterator();
    }

    private class Rubiterator implements Iterator<Namekey> {
        int idx;
        public Rubiterator() {
            idx = 0;
            
        }

        @Override
        public boolean hasNext() {
            return idx<rubrica.size()-1;
        }

        @Override
        public Namekey next() {
            return rubrica.
        }
    }
   
   
}
