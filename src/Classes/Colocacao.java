/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Objects;

/**
 *
 * @author Leandro
 */
public class Colocacao {
    
    private int id;
    private Jogadores jogador;
    private Campeonatos campeonato;
    
    

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return  jogador.getNome();
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jogadores getJogador() {
        return jogador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.campeonato);
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
        final Colocacao other = (Colocacao) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.jogador, other.jogador)) {
            return false;
        }
        if (!Objects.equals(this.campeonato, other.campeonato)) {
            return false;
        }
        return true;
    }

    public void setJogador(Jogadores jogador) {
        this.jogador = jogador;
    }

    public Campeonatos getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonatos campeonato) {
        this.campeonato = campeonato;
    }
    
    public String getInfo()
    {
        String aux="";
        
        if(jogador!=null)
        {
            aux+="Jogador: "+jogador;
           if(jogador.getPontuacao()!=0)
           {
                aux+="\nPontuação: "+jogador.getPontuacao();
           }
           
        }
        if(campeonato!=null)
        {
            aux+="\nCampeonato: "+campeonato;
            aux+="\nData: "+campeonato.getData();
        }
        
        return aux;
    }
    
}
