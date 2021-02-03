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
import java.util.Objects;
import java.util.Set;

/**
 *
 * @author utente
 */
public class Rubrica implements Iterable<Map.Entry<Vocekey,Set<Contatto>>>{
    
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
    
    public void nuovaVoce(Vocekey voce,Set<Contatto> contatti) {
      /* for(Contatto c: contatti)
           addContatto(voce, c);*/
       contatti.forEach(c -> addContatto(voce, c));
    }
    
   public boolean addContatto(Vocekey namekey,Contatto contatto) {
        Objects.requireNonNull(namekey, "voce non deve essere null");
        Objects.requireNonNull(contatto, "contatto non deve essere null");
        if(!rubrica.containsKey(namekey)){
           Set<Contatto> c = new HashSet<>();
           c.add(contatto);
           rubrica.put(namekey, c);
           return false;
        }else{   
            rubrica.get(namekey).add(contatto);
            return true;
        }    
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
        public Iterator<Map.Entry<Vocekey, Set<Contatto>>> iterator() {
        return rubrica.entrySet().iterator();
        }
    }
   
   

