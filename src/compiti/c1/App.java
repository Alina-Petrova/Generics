/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c1;

/**
 *
 * @author utente
 */
public class App {
    public static void main(String[] args) {
        
         Catalogo cat1 = new Catalogo();
         SingoloArticolo articolo1 = new SingoloArticolo("Articolo1",10);
         SingoloArticolo articolo2 = new SingoloArticolo("Articolo2",20);         
         SingoloArticolo articolo3 = new SingoloArticolo("Articolo3",30);         
         SingoloArticolo articolo4 = new SingoloArticolo("Articolo4",40);
         SingoloArticolo articolo5 = new SingoloArticolo("Articolo5",50);
         SingoloArticolo articolo6 = new SingoloArticolo("Articolo6",60);         
         SingoloArticolo articolo7 = new SingoloArticolo("Articolo7",70);         
         SingoloArticolo articolo8 = new SingoloArticolo("Articolo8",80);
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
    }
}
