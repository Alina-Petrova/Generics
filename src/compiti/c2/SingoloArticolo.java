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
public abstract class SingoloArticolo{
    private final String nome;
    private double prezzo=0;   

    public SingoloArticolo(String nome,double prezzo) {
        this.nome=nome;
        this.prezzo=prezzo;
    }


    
    
}
