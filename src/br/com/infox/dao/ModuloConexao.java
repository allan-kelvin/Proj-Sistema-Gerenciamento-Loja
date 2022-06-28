
package br.com.infox.dao;

import java.sql.*; //Pacotes que fazem a comunicação / Conexão com o banco de dados;

public class ModuloConexao {
    
    // Método resposavel por estabelecer a conexao com o banco.
    //Conector: é o metodo que faz a conexão
    public static Connection conector(){
              
        Connection conexao = null;
        
        // a linha a baixo chama o drive que eu importei para biblioteca
        String driver ="com.mysql.cj.jdbc.Driver";
        
        //Armazenando informações referente ao banco.       
        String url="jdbc:mysql://localhost:3306/dbinfox";
        String user="root";
        String password="admin";
        
        //Estabelecendo a conexao com o banco
        
        try {
            
           Class.forName(driver); // Exexuta o Driver
           conexao = DriverManager.getConnection(url,user,password);//Ele vai obter a conexao
           return conexao;
        } catch (Exception e) {
            
            // a linha a baixo serve de apoio para esclarecer  o erro; 
            System.err.println("Falha na Conexão com o banco de Dados");
            return null;
        }
        
    }
    
}
