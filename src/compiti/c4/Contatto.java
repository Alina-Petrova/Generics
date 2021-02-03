/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiti.c4;

import java.util.Objects;

/**
 *
 * @author utente
 */
public class Contatto {
    public static enum TipoContatto {PERSONALE,CASA,UFFICIO,EMAIL,TELEGRAM};
    
    private TipoContatto tipoC;
    private String contatto;

    public Contatto() {
    }
    

    public Contatto(TipoContatto tipoC,String contatto) {
        this.contatto = contatto;
        this.tipoC = tipoC;
    }
    
   // public Set<Contatto> agg

    public String getNome() {
        return contatto;
    }

    public TipoContatto getTipo() {
        return tipoC;
    } 

    @Override
    public String toString() {
        return "Contatto{" + "tipoC=" + tipoC + ", contatto=" + contatto + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.tipoC);
        hash = 79 * hash + Objects.hashCode(this.contatto);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contatto other = (Contatto) obj;
        if (!Objects.equals(this.contatto, other.contatto)) {
            return false;
        }
        if (this.tipoC != other.tipoC) {
            return false;
        }
        return true;
    }
    
}
