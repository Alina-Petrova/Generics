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
public class Vocekey {
    public static enum TipoLegame {AMICIZIE, LAVORO, SPORT, MUSICA,FAMIGLIA};
    
    private String nome;
    private TipoLegame tipoL;

    public Vocekey(String nome, TipoLegame tipoL) {
        this.nome = nome;
        this.tipoL = tipoL;
    }

    public String getNome() {
        return nome;
    }

    public TipoLegame getTipoL() {
        return tipoL;
    }

    @Override
    public String toString() {
        return "Namekey{" + "nome=" + nome + ", tipoL=" + tipoL + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nome);
        hash = 59 * hash + Objects.hashCode(this.tipoL);
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
        final Vocekey other = (Vocekey) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.tipoL != other.tipoL) {
            return false;
        }
        return true;
    }
}
