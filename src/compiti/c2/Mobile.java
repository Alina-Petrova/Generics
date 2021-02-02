    
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
    private String nome="";
    private double prezzo=0;
    
    private Integer[] misure = new Integer[3];      


    public Mobile(String nome, double prezzo,int larghezza,int altezza,int profondita) {
        super(nome, prezzo);
        this.misure[0] = larghezza;
        this.misure[1] = altezza;
        this.misure[2] = profondita;   
    }

    public Integer[] getMisure() {
        return misure;
    }

    public int getLarghezza() {
        return misure[0];
    }

    public int getAltezza() {
        return misure[1];
    }

    public int getProfondita() {
        return misure[2];
    }   
    
    
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
    @Override
    public String toString() {
       return "Nome = "+nome+" prezzo "+prezzo+"\n"+"le misure: ("+ misure[0]+","+misure[1]+","+misure[2]+")\n";
    }
    
}
