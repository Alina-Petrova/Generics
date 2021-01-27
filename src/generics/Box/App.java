/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.Box;

import java.util.Optional;

/**
 *
 * @author utente
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Box<String> box = new Box();
        Box<Computer> box1 = new Box();
        
        Optional<String> opt = Optional.of("ciao");
        Optional<String> empty = Optional.empty();
    }
    
}
