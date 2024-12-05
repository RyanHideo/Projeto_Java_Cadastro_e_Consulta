/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;
import java.sql.*;
import java.sql.SQLException;
import Modelo.EnderecoM;
import Controle.*;
import controle.Conexao;
/**
 *
 * @author ra194399
 */
public class EnderecoC {
    Conexao banco = new Conexao();
    String resposta="";
    ResultSet dados =null;
    
    
    public String CadastroEndereco(EnderecoM endereco){
           
        try{
         banco.ConectaBD();
         String SQL="insert into endereco values( '" + endereco.getRua() + "'," + endereco.getNumero() + ",'" + endereco.getBairro()
                    + "','" + endereco.getCidade() + "','" + endereco.getEstado() + "','" + endereco.getCep() + "','" + endereco.getObs()+ "')"; 
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
        String SQL= "Select * from endereco";
        dados = banco.getStatement().executeQuery(SQL);
        banco.destroy();
    }catch(Exception erro){
        erro.printStackTrace();
    }
    return dados;
}
      public ResultSet ConsultaPorCEP(String cep){
    try{
        banco.ConectaBD();
        String SQL= "Select * from endereco WHERE cep = '" + cep + "';";
        dados = banco.getStatement().executeQuery(SQL);
        banco.destroy();
    }catch(Exception erro){
        erro.printStackTrace();
    }
    return dados;
}
  
    
        
}   
