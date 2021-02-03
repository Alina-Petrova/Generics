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
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
    
        public Catalogo<E> getCatArticoliSottoPrezzo(double prezzo) {

        Catalogo<E> ris = new Catalogo<>();
        for(E el: catalogoArt) {
            if(el.getPrezzo()<prezzo)
                ris.addArticolo(el);
        }
        return ris;
    }
    
    public List<E> getArticoliSottoPrezzo(double prezzo) {
        return catalogoArt.stream().filter(var -> var.getPrezzo()<prezzo).collect(Collectors.toList());
    }
    
    
    public String infoCat() {
        String ris = "";
        for(E el: catalogoArt)
            ris+=el.toString();
        return ris;
    }

    @Override
    public String toString() {
        return catalogoArt.stream().map(v->v.getNome()+" - "+v.getPrezzo()).collect(Collectors.joining("\n"));
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
