/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics.Box.StackIterable;

import generics.Box.Stack.*;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author utente
 */
public class MiaPila<T> implements Stack<T>, Iterable<T>{
    private final int num;
    private final T[] arr;
    private int lastidx = -1;

    public MiaPila(int num) {
        this.num = num;
        arr = (T[]) new Object[num];
    }  

    @Override
    public boolean put(T t) {
        if(lastidx==arr.length-1)
            return false;

        arr[++lastidx]=t;
        return true;         
    }

    @Override
    public T get() {
        if(lastidx==-1)
            return null;
        T ris = arr[lastidx];
        arr[lastidx]=null;
        lastidx--;
        return ris;
    }

    @Override
    public int length() {
        return arr.length;
    }

    @Override
    public String toString() {
        String ris = "";
        for (int i=0; i<num; i++) {
            ris+=arr[i]+" ";
        }
        ris+="ultimo idx = :" + lastidx+"\n";
        return ris;
    }
    @Override
    public Iterator<T> iterator() {        
        return new StIterator();
    }   
    private class StIterator implements Iterator<T>{
            private int idx;
            public StIterator() {
                idx = 0;
        }
            
            @Override
            public boolean hasNext() {
                return idx<num;
            }

            @Override
            public T next() {
                return arr[idx++];
            }
    }
   
}





    

