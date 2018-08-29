/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Leandro
 */
public class Campeonatos {
    
    private int id;
    private String nome;
    private int pontos;
    private Date data;


    @Override
    public String toString() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public String getInfo()
    {
        String aux="";
        
        if(!nome.isEmpty())
        {
            aux+="Nome: "+nome;
        }
        if(pontos!=0)
        {
            aux+="\nPontos: "+pontos;
        }
        
        if(data!=null)
        {
            aux+="\nData: "+data;
        }
        
        return aux;
    }
    
    
}
