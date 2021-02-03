    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c2;

import compiti.c1.*;
import java.util.ArrayList;

/**
 *
 * @author utente
 */
public class Mobile extends SingoloArticolo implements Articolo{
    private final String nome="";
    private final double prezzo=0;
    private final int larghezza, altezza, profondita;
     


    public Mobile(String nome, double prezzo,int larghezza,int altezza,int profondita) {
        super(nome, prezzo);
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;   
    }

    
    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getProfondita() {
        return profondita;
    }   
    
    
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
    @Override
    public String toString() {
       return super.toString()+"le misure: ("+ larghezza+","+altezza+","+profondita+")\n";
    }
    
}
