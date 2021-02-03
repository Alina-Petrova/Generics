/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author utente
 */
public class App {
    public static void main(String[] args) {
        
         Catalogo cat1 = new Catalogo();
         Mobile articolo1 = new Mobile("Articolo1",10,3,8,9);
         Mobile articolo2 = new Mobile("Articolo2",20,23,6,98);         
         Mobile articolo3 = new Mobile("Articolo3",30,7,1,2);         
         Mobile articolo4 = new Mobile("Articolo4",40,7,6,5);
         Mobile articolo5 = new Mobile("Articolo5",50,96,23,56);
         Mobile articolo6 = new Mobile("Articolo6",60,1,2,3);         
         Mobile articolo7 = new Mobile("Articolo7",70,3,4,5);         
         Mobile articolo8 = new Mobile("Articolo8",80,6,3,1);
         Stoffa articolo9 = new Stoffa("Seta",55,10,"Rosso");
         Stoffa articolo10 = new Stoffa("Cotone",77,5,"Bianco");
         cat1.addArticolo(articolo1);
         cat1.addArticolo(articolo2);
         cat1.addArticolo(articolo3);
         cat1.addArticolo(articolo4);
         cat1.addArticolo(articolo5);
         cat1.addArticolo(articolo6);
         cat1.addArticolo(articolo7);
         cat1.addArticolo(articolo8);
         cat1.addArticolo(articolo9);
         cat1.addArticolo(articolo10);
         
         System.out.println(cat1.toString());
         
         System.out.println(cat1.getArticoliSottoPrezzo(40));
         System.out.println(ProvaMobile.scegliMobile(cat1, 60, 8, 8, 100));
         
    }
    
    public static <T extends Number> List<T> minoreDi(T[] arr,T num) {
        return Arrays.asList(arr).stream()
                .filter(v->v.doubleValue()<num.doubleValue()).collect(Collectors.toList());
    }
}
