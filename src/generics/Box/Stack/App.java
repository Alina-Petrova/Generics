/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.Box.Stack;

/**
 *
 * @author utente
 */
public class App {
    public static void main(String[] args) {
        MiaPila<String> st1 = new MiaPila<>(3);
        MiaPila<Integer> st2 = new MiaPila<>(6);
        
        st1.put("uno");
        st1.put("due");
        st1.get();
        st1.put("tre");
        System.out.println(st1.toString());
        
        st2.put(1);
        st2.put(2);
        st2.put(3);
        st2.get();
        st2.put(4);
        st2.put(1);
        st2.put(2);
        st2.put(3);
        System.out.println(st2.toString());
        
    }
}
