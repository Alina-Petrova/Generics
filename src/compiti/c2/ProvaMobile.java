/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author utente
 */
public class ProvaMobile {

    public ProvaMobile() {
    }
    
    
    public static <E extends Mobile> Catalogo<E> scegliMobile(Catalogo<E> cat, double prezzo, int larghezza,int altezza,int profondita) {
        Catalogo<E> ris = new Catalogo<>();
        Integer[] misureEs = {larghezza,altezza,profondita};
        ris = getArticoliSottoMisura(cat.getArticoliSottoPrezzo(prezzo),misureEs);        
        return ris;
    }
    public static <E extends Mobile, T extends Number> Catalogo<E> getArticoliSottoMisura(Catalogo<E> cat,Integer[] arrNum){
        Catalogo<E> ris = new Catalogo<>();
        for(E el:cat)
            //if(el)
            if(minoriDiArray(el.getMisure(),arrNum))
                ris.addArticolo(el);                    
        return ris;
    }
    public static <T extends Number> boolean minoriDiArray(Comparable<T>[] arrNum1, Comparable<T>[] arrNum2) {
                
        return (arrNum1[0].compareTo((T) arrNum2[0])<0 && arrNum1[1].compareTo((T) arrNum2[1])<0 && arrNum1[2].compareTo((T) arrNum2[2])<0);
                
    }
    
}
