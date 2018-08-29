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
public class Jogadores {
    
    private String nome;
    private int vitoria;
    private int empate;
    private String email;
    private String endereco;
    private int id;
    private int pontuacao;

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nome);
        hash = 41 * hash + this.vitoria;
        hash = 41 * hash + this.empate;
        hash = 41 * hash + Objects.hashCode(this.email);
        hash = 41 * hash + Objects.hashCode(this.endereco);
        hash = 41 * hash + this.id;
        hash = 41 * hash + this.pontuacao;
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
        final Jogadores other = (Jogadores) obj;
        if (this.vitoria != other.vitoria) {
            return false;
        }
        if (this.empate != other.empate) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (this.pontuacao != other.pontuacao) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVitoria() {
        return vitoria;
    }

    

    public int getEmpate() {
        return empate;
    }

    public int getId() {
        return id;
    }
    
    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }


    public void setEmpate(int empate) {
        this.empate = empate;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    
    public String getInfo()
    {
        String aux="";
        
        if(!nome.isEmpty())
        {
            aux+="Nome: "+nome;
        }
        if(vitoria!=0)
        {
            aux+="\nVitorias: "+vitoria;
        }
        
        if(empate!=0)
        {
            aux+="\nEmpates: "+empate;
        }
        if(!email.isEmpty())
        {
            aux+="\nEmail: "+email;
        }
        if(!endereco.isEmpty())
        {
            aux+="\nEndereço: "+endereco;
        }
        if(pontuacao!=0)
        {
            aux+="\nPontuação: "+pontuacao;
        }
        
        return aux;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    
}
