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
         cat1.addArticolo(articolo1);
         cat1.addArticolo(articolo2);
         cat1.addArticolo(articolo3);
         cat1.addArticolo(articolo4);
         cat1.addArticolo(articolo5);
         cat1.addArticolo(articolo6);
         cat1.addArticolo(articolo7);
         cat1.addArticolo(articolo8);
         
         System.out.println(cat1.toString());
         Catalogo cat2 = new Catalogo();
         cat2 = cat1.getArticoliSottoPrezzo(40);
         System.out.println(cat2.toString());
         cat2 = ProvaMobile.scegliMobile(cat1, 60, 8, 8, 100);
         System.out.println(cat2.toString());
         
    }
    
    public static <T extends Number> List<T> minoreDi(Comparable<T>[] arr,Comparable<T> num) {
        List<T> ris = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
            if(arr[i].compareTo((T) num)<0)
                ris.add((T) arr[i]);
        return ris;
    }
}
