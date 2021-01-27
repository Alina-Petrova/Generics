/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.Box.StackIterable;

import java.util.Iterator;
import java.util.Objects;

/**
 *
 * @author utente
 */
public class App {
    public static void main(String[] args) {

        MiaPila<Integer> st2 = new MiaPila<>(6);
        st2.put(1);
        st2.put(2);
        st2.put(3);
        st2.put(4);
        st2.put(5);
        st2.put(6);
        //st2.put(3);
        stampa(st2);
        System.out.println("-----------------------------\n");
        MiaPila<Integer> st3 = new MiaPila<>(4);
        st3.put(7);
        st3.put(8);
        st3.put(9);
        st3.put(10);
        stampa(st3);
        System.out.println("-----------------------------\n");
        stampa(unione(st2, st3));
        System.out.println("-----------------------------\n");
        

        
    }
        public static <T> void stampa(Iterable<T> it) {
            Objects.requireNonNull(it);  // oggetto non nullo
            Iterator<T> visit = it.iterator();
            while(visit.hasNext())
                System.out.println(visit.next());
        }
        
        public static <T extends Number> double totale(Iterable<T> it) {
            double ris=0;
            Iterator<T> visit = it.iterator();
            while(visit.hasNext())               // for(T t: it)
                ris+=visit.next().doubleValue();
            return ris;
        }
        
        public static <T> MiaPila<T> unione(MiaPila<T> p1, MiaPila<T> p2) {
            MiaPila<T> ris1 = new MiaPila(p1.length()+p2.length());
            MiaPila<T> ris2 = new MiaPila(p1.length()+p2.length());
            for(int i=0; i<p2.length(); i++)
                ris1.put(p2.get());
            for(int i=0; i<p1.length(); i++)
                ris1.put(p1.get()); 
            for(int i=0; i<ris1.length(); i++)
                ris2.put(ris1.get());
            return ris2;
        }
}
