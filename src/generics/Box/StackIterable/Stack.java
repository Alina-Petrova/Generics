/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.Box.StackIterable;

import generics.Box.Stack.*;

/**
 *
 * @author utente
 */
public interface Stack  <T> {
        
	boolean put (T t); //aggiunge elemento
	T get (); //estrae elemento
	int length (); //dimensione dello stack             
}
   
