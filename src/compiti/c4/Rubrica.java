/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author utente
 */
public class Rubrica implements Iterable<Vocekey>{
    
   public static Map <Vocekey,Set<Contatto>> rubrica;

    public Rubrica() {
        rubrica = new HashMap<Vocekey,Set<Contatto>>();       
    }
   
    public void nuovaVoce(String nome,Vocekey.TipoLegame tipoL) {
        rubrica.putIfAbsent(new Vocekey(nome,tipoL), new HashSet<Contatto>());
    }
    
    public void nuovaVoce(String nome,Vocekey.TipoLegame tipoL,Contatto.TipoContatto tipoC,String contatto) {
        Contatto newC = new Contatto(tipoC,contatto);
        Set s = new HashSet<Contatto>();
        s.add(newC);
        rubrica.put(new Vocekey(nome,tipoL), s);      //se esiste gia, lo crea???
    }
    
    public void nuovaVoce(Vocekey voce,HashSet<Contatto> contatti) {
        rubrica.put(voce, contatti);
    }
    
   public boolean addContatto(Vocekey namekey,Contatto contatto) {
        if(!rubrica.containsKey(namekey))
           return false;
       rubrica.get(namekey).add(contatto);
       return true;
   }
   
   public boolean modify(Vocekey namekey,Contatto contattoOld, Contatto contattoNew) {
       if(!rubrica.containsKey(namekey))
           return false;
       if(!rubrica.containsValue(contattoOld))
            return false;    
       rubrica.get(namekey).remove(contattoOld);
       rubrica.get(namekey).add(contattoNew);
       return true;
   }
   
   public boolean eliminaVoce(Vocekey namekey) {
        if(!rubrica.containsKey(namekey))
           return false;
        rubrica.remove(namekey);
        return true;
   }
   
   public boolean eliminaContatto(Vocekey namekey,Contatto contatto) {
        if(!rubrica.containsKey(namekey))
           return false;
        rubrica.get(namekey).remove(contatto);
        return true;
   }

    @Override
    public Iterator<Vocekey> iterator() {
        return new Rubiterator();
    }

    private class Rubiterator implements Iterator<Vocekey> {
        int idx;
        public Rubiterator() {
            idx = 0;
            
        }

        @Override
        public boolean hasNext() {
            return idx<rubrica.size()-1;
        }

        @Override
        public Vocekey next() {
            return rubrica.
        }
    }
   
   
}
