/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.Box;

/**
 *
 * @author utente
 */
public class Box <T>{
    private T oggetto;
    
    public void inserisci(T o) {
        oggetto = o;
    }
    
    public T estrai() {
        return oggetto;
    }
            
}
