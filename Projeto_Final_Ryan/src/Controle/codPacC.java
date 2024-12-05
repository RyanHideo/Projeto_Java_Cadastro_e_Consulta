/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.codPacM;
import controle.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ryan
 */
public class codPacC {
    Conexao banco = new Conexao();
    String resposta="";
    ResultSet dados =null;
    
    
   public String cadastroPaciente(codPacM codpacm){
       try{
         banco.ConectaBD();
         String SQL="insert into pacientes values( '"+ codpacm.getCodigo()+"','"+ codpacm.getCpf()+"')"; 
         
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
   public String cadastroMedico(codPacM codpacm){
       try{
         banco.ConectaBD();
         String SQL="insert into medicos values( '"+ codpacm.getCodigo()+"','"+ codpacm.getCpf()+"')"; 
         
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
}
