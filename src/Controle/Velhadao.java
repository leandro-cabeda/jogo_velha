/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Classes.Campeonatos;
import Classes.Colocacao;
import Classes.Jogadores;
import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Leandro
 */
public class Velhadao {
    
    Connection con=(new Conexao()).getConexao();
     PreparedStatement ps;
     ResultSet rs; 
     
     
     public ArrayList<Colocacao> buscarCol(){
     ArrayList<Colocacao> lista=new ArrayList();
     /*String sql="select distinct j.nome_jo,j.pontuacao,j.id_jo,j.endereco,j.email,j.vitoria,j.empate,"
                    + "c.id_ca,c.nome_ca,c.d_data,c.pontos,"
                    + "co.id_co "
                    + "from jogadores j,campeonatos c,colocacao co "
                    + "where j.id_jo=co.jogador and c.id_ca=co.campeonato and j.pontuacao > 0 "
                    + "order by j.pontuacao desc limit 3";*/
        try {
            String sql="select distinct j.nome_jo,j.pontuacao,j.id_jo,"
                    + "c.nome_ca,c.d_data,c.id_ca,co.id_co "
                    + "from jogadores j,campeonatos c,colocacao co "
                    + "where j.id_jo=co.jogador and c.id_ca=co.campeonato and j.pontuacao > 0 "
                    + "order by j.pontuacao desc limit 3";
            
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Jogadores j=new Jogadores();
                j.setId(rs.getInt("id_jo"));
                j.setNome(rs.getString("nome_jo"));
                //j.setEndereco(rs.getString("endereco"));
                //j.setVitoria(rs.getInt("vitoria"));
                //j.setEmpate(rs.getInt("empate"));
                j.setPontuacao(rs.getInt("pontuacao"));
                //j.setEmail(rs.getString("email"));
                
                
                Campeonatos c=new Campeonatos();
                c.setId(rs.getInt("id_ca"));
                c.setNome(rs.getString("nome_ca"));
                //c.setPontos(rs.getInt("pontos"));
                c.setData((java.util.Date)rs.getDate("d_data"));
                
                Colocacao col=new Colocacao();
                col.setId(rs.getInt("id_co"));
                col.setJogador(j);
                col.setCampeonato(c);
                lista.add(col);
               
            }
            
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro ao buscar dados da tabela Colocação \n"+ex);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    rs.close();
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
        return lista;
    }
     
     
     
     public ArrayList<Jogadores> buscar(){
     ArrayList<Jogadores> lista=new ArrayList();
        try {
            String sql="Select *from jogadores";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Jogadores j=new Jogadores();
                j.setId(rs.getInt("id_jo"));
                j.setNome(rs.getString("nome_jo"));
                j.setEndereco(rs.getString("endereco"));
                j.setVitoria(rs.getInt("vitoria"));
                j.setEmpate(rs.getInt("empate"));
                j.setPontuacao(rs.getInt("pontuacao"));
                j.setEmail(rs.getString("email"));
               lista.add(j);
               
            }
            
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro ao buscar dados da tabela Jogadores \n"+ex);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    rs.close();
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
        return lista;
    }
     
     public ArrayList<Campeonatos> buscar2(){
     ArrayList<Campeonatos> lista=new ArrayList();
        try {
            String sql="Select * from campeonatos";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next())
            {
                Campeonatos c=new Campeonatos();
                c.setId(rs.getInt("id_ca"));
                c.setNome(rs.getString("nome_ca"));
                c.setPontos(rs.getInt("pontos"));
                c.setData((java.util.Date)rs.getDate("d_data"));
               lista.add(c);
               
            }
            
        } 
        catch (SQLException ex) 
        {
            System.out.println("Erro ao buscar dados da tabela Campeonatos \n"+ex);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    rs.close();
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
        return lista;
    }
     
     public  void adicionar(Colocacao co)
    {
        String sql="insert into colocacao (jogador,campeonato)"
                +" values(?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,co.getJogador().getId());
            ps.setInt(2,co.getCampeonato().getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados da tabela Colocação: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
     
     
     public  void adicionar(Jogadores obj)
    {
        String sql="insert into jogadores (nome_jo,endereco,email)"
                +" values(?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,obj.getNome());
            ps.setString(2,obj.getEndereco());
            ps.setString(3,obj.getEmail());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados da tabela Jogadores: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
     
     public  void adicionarcam(Campeonatos obj)
    {
        String sql="insert into campeonatos (nome_ca,pontos,d_data)"
                +" values(?,?,?)";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,obj.getNome());
            ps.setInt(2,obj.getPontos());
            ps.setDate(3,new java.sql.Date (obj.getData().getTime()));
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao inserir dados da tabela Campeonatos: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
     
     public  void excluir(Colocacao ob)
    {
        String sql="delete from colocacao where id_co=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,ob.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir dados da tabela Colocacao: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
    
    public  void excluir(Jogadores obj)
    {
        String sql="delete from jogadores where id_jo=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir dados da tabela Jogadores: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
    
    public  void excluircam(Campeonatos obj)
    {
        String sql="delete from campeonatos where id_ca=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,obj.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao excluir dados da tabela Campeonatos: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
    
    public  void editar(Jogadores ob)
    {
        String sql="update jogadores set nome_jo=?,endereco=?,email=? where id_jo=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,ob.getNome());
            ps.setString(2,ob.getEndereco());
            ps.setString(3,ob.getEmail());
            ps.setInt(4,ob.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao editar dados da tabela jogadores: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
    
    public  void editarcam(Campeonatos ob)
    {
        String sql="update campeonatos set nome_ca=?,pontos=?,d_data=? where id_ca=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setString(1,ob.getNome());
            ps.setInt(2,ob.getPontos());
            ps.setDate(3,new java.sql.Date (ob.getData().getTime()));
            ps.setInt(4,ob.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao editar dados da tabela campeonatos: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
    
    public  void editar2(Jogadores ob)
    {
        String sql="update jogadores set vitoria=? where id_jo=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,ob.getVitoria());
            ps.setInt(2,ob.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao editar dados da tabela Jogadores: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
    
    public  void editar3(Jogadores ob,Jogadores ob2)
    {
        String sql="update jogadores set empate=? where id_jo=?";
        String sql2="update jogadores set empate=? where id_jo=?";
        try {
            ps=con.prepareStatement(sql);
            ps.setInt(1,ob.getEmpate());
            ps.setInt(2,ob.getId());
            ps.executeUpdate();
            
            ps=con.prepareStatement(sql2);
            ps.setInt(1,ob2.getEmpate());
            ps.setInt(2,ob2.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao editar dados da tabela Jogadores: "+e);
        }
        finally // obrigação no final do try catch quando termina
        {
                try 
                {
                    ps.close();
                    
                   con.close();
                } 
                catch (SQLException ex) 
                {
                    System.out.println("Erro: "+ex);
                }
            
        }
        
    }
    
}
