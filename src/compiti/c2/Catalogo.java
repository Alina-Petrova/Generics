/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c2;

import compiti.c1.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author utente
 */
public class Catalogo <E extends Articolo> implements Iterable<E> {
    
    private final List<E> catalogoArt;
    

    public <E extends Articolo> Catalogo() {
        catalogoArt = new ArrayList<>();
    }
    
    public void addArticolo(E art) {
        catalogoArt.add(art);
    }
    
    public Catalogo<E> getArticoliSottoPrezzo(double prezzo) {

        Catalogo<E> ris = new Catalogo<>();
        /*Iterator<E> visit = catalogoArt.iterator();
        while(visit.hasNext())
            if(visit.next().getPrezzo()<prezzo)
                ris.addArticolo()*/
        for(E el: catalogoArt) {
            if(el.getPrezzo()<prezzo)
                ris.addArticolo(el);
        }
        return ris;
    }
    
    
     @Override
    public String toString() {
        String ris = "";
        for(E el: catalogoArt)
            ris+=el.toString();
        return ris;
    }

    @Override
    public Iterator<E> iterator() {
        return new CatIterator();
    }

    private class CatIterator implements Iterator<E> {
        private int idx;
        public CatIterator() {
            idx = 0;
        }

        @Override
        public boolean hasNext() {
            return idx<catalogoArt.size()-1;
        }

        @Override
        public E next() {
            return catalogoArt.get(idx++);
        }
    }

   
    
}
