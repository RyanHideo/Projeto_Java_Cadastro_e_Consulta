/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import java.sql.*;
import java.sql.SQLException;
import Modelo.DadosPessoaisM;
import Controle.*;
import controle.Conexao;
/**
 *
 * @author ra194399
 */
public class DadosPessoaisC {
    Conexao banco = new Conexao();
    String resposta="";
    ResultSet dados =null;
    
    
    public String CadastroPessoa(DadosPessoaisM Pessoa){
           
        try{
         banco.ConectaBD();
         String SQL="insert into DadosPessoais values( '"+Pessoa.getNome()+"','"+Pessoa.getCpf()+"','"+ Pessoa.getRg()+"','"+Pessoa.getSexo()
                    +"','"+Pessoa.getData()+"','"+Pessoa.getEmail()+"','"+Pessoa.getFone1()+"','"+Pessoa.getFone2()+"')"; 
         
         //INSERT INTO DadosPessoais values ('Ryan','711.005.621-09','9989898','Masculnio','10/01/2002','RyanHideoOugaske@gmail.com', '(67)9999-9999', '(67)9999-8888')
         
         banco.getStatement().execute(SQL);
         banco.destroy();
         resposta="OK!";
     }catch(SQLException erro){
         erro.printStackTrace();
         resposta="ERRO";
     }
     return resposta;
    }
    public ResultSet ConsultaGeral(){
    try{
        banco.ConectaBD();
        String SQL= "Select * from DadosPessoais";
        dados = banco.getStatement().executeQuery(SQL);
        banco.destroy();
    }catch(Exception erro){
        erro.printStackTrace();
    }
    return dados;
}
      public ResultSet ConsultaPorCPF(String cpf){
    try{
        banco.ConectaBD();
        String SQL= "Select * from DadosPessoais WHERE cpf = '" + cpf + "'";
        dados = banco.getStatement().executeQuery(SQL);
        banco.destroy();
    }catch(Exception erro){
        erro.printStackTrace();
    }
    return dados;
}
  
    
        
}   