/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c4;

import compiti.c4.Contatto.TipoContatto;
import compiti.c4.Namekey.TipoLegame;

/**
 *
 * @author utente
 */
public class App {
    public static void main(String[] args) {
        
        
        Rubrica rub1 = new Rubrica();
        
        Contatto c1 = new Contatto(TipoContatto.CASA,"0125 43267");
        Namekey n1 = new Namekey("Mario Rossi", TipoLegame.SPORT);
        
        Contatto c2 = new Contatto(TipoContatto.TELEGRAM,"CiccioBello");
        Namekey n2 = new Namekey("Ricardo Bianchi", TipoLegame.AMICIZIE);
        
        rub1.addContatto(n1, c1);
        rub1.addContatto(n2, c2);
        
        
    }
}
