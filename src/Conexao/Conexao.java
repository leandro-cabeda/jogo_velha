/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




/**
 *
 * @author Leandro
 */
public class Conexao {
  
    public Conexao()
    {
        try 
        {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException ex) 
        {
            System.out.println("Biblioteca não adiciona");
        }
    }
     public Connection getConexao()
     {
         Connection con=null;
        String url="jdbc:postgresql://localhost:5432/Trabalho_LPOO_2_Etapa";
        String user="postgres";
        String senha="963852741";
        
        try {
            con = DriverManager.getConnection(url, user,senha);
            
        } catch (SQLException ex) {
            System.out.println("Erro ao conectar");
        }
        return con;
     }
        
    
}
