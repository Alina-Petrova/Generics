/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author utente
 */
public class ProvaMobile {

    public ProvaMobile() {
    }
    
    
    public static <E extends Mobile> List<E> scegliMobile(Catalogo<E> cat, double prezzo, int larghezza,int altezza,int profondita) {
        
        return cat.getArticoliSottoPrezzo(prezzo).stream()
                .filter(v->v.getLarghezza()<larghezza && v.getAltezza()<altezza && v.getProfondita()<profondita).collect(Collectors.toList());
    }

}
