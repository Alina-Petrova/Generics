/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c2;

/**
 *
 * @author utente
 */
public class Stoffa extends SingoloArticolo implements Articolo{
    
    private String nome="";
    private double prezzo=0;
    
    private float metraggio=0;
    private String colore="";

    public Stoffa(String nome, double prezzo, float metraggio, String colore) {
        super(nome, prezzo);
        this.metraggio=metraggio;    
        this.colore=colore;
    }
    
    
    
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo*metraggio;
    }
    
    
    
}
