    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c2;

import compiti.c1.*;

/**
 *
 * @author utente
 */
public class SingoloArticolo implements Articolo{
    private String nome="";
    private double prezzo=0;

    public SingoloArticolo(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }


    
    
    
    public String getNome() {
        return nome;
    }
    public double getPrezzo() {
        return prezzo;
    }
    @Override
    public String toString() {
       return "Nome = "+nome+" prezzo "+prezzo+"\n";
    }
    
}
