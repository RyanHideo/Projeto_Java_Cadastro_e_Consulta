/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.consultaM;
import com.sun.jdi.connect.spi.Connection;
import controle.Conexao;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ryan
 */
    

public class consultaC {
    Conexao banco = new Conexao();
    String resposta="";
    ResultSet dados =null;
        
    public String cadastrarConsulta(consultaM consultam){
    
        try{
         banco.ConectaBD();
         String SQL="insert into consultas values( '"+ consultam.getCodigo()+"','"+ consultam.getCpf_med()+"','" + consultam.getCpf_pac()
                                                       +"','" + consultam.getSituacao() + "','" + consultam.getObs() + "')"; 
         
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
    public ResultSet consultarConsultaGeral(){
        
        try{
         banco.ConectaBD();
         String SQL="SELECT " + "consultas.codigo, " + "medicos.cpf AS cpf_medico, " + "medicos_dados.nome AS nome_medico, " 
                 + "medicos_dados.fone AS fone_medico, " + "pacientes.cpf AS cpf_paciente, " + "pacientes_dados.nome AS nome_paciente, "
                 + "pacientes_dados.fone AS fone_paciente, " + "consultas.situação, " + "consultas.OBS " + "FROM consultas " 
                 + "JOIN medicos ON consultas.cpf_med = medicos.cpf " + "JOIN dadospessoais AS medicos_dados ON medicos.cpf = medicos_dados.cpf "
                 + "JOIN pacientes ON consultas.cpf_pac = pacientes.cpf " + "JOIN dadospessoais AS pacientes_dados ON pacientes.cpf = pacientes_dados.cpf "
                 + "ORDER BY consultas.codigo;";          
        dados = banco.getStatement().executeQuery(SQL);
        banco.destroy();
    }catch(Exception erro){
        erro.printStackTrace();
    }
    return dados;
}
    public ResultSet consultarConsultaPorCpfMedico(String cpfMedico){
        
        try{
         banco.ConectaBD();
         String SQL = "SELECT " 
           + "consultas.codigo, " 
           + "medicos.cpf AS cpf_medico, "
           + "medicos_dados.nome AS nome_medico, "
           + "medicos_dados.fone AS fone_medico, " 
           + "pacientes.cpf AS cpf_paciente, " 
           + "pacientes_dados.nome AS nome_paciente, " 
           + "pacientes_dados.fone AS fone_paciente, " 
           + "consultas.situação, " 
           + "consultas.OBS " 
           + "FROM consultas " 
           + "JOIN medicos ON consultas.cpf_med = medicos.cpf "
           + "JOIN dadospessoais AS medicos_dados ON medicos.cpf = medicos_dados.cpf " 
           + "JOIN pacientes ON consultas.cpf_pac = pacientes.cpf " 
           + "JOIN dadospessoais AS pacientes_dados ON pacientes.cpf = pacientes_dados.cpf " 
           + "WHERE consultas.cpf_med ='" + cpfMedico + "' " 
           + "ORDER BY consultas.codigo;";
         
        dados = banco.getStatement().executeQuery(SQL);
        banco.destroy();
    }catch(Exception erro){
        erro.printStackTrace();
    }
    return dados;
}
    public ResultSet consultaPorCpfPaciente(String cpfPaciente){
        try{
         banco.ConectaBD();
         String SQL = "SELECT " 
           + "consultas.codigo, " 
           + "medicos.cpf AS cpf_medico, "
           + "medicos_dados.nome AS nome_medico, "
           + "medicos_dados.fone AS fone_medico, " 
           + "pacientes.cpf AS cpf_paciente, " 
           + "pacientes_dados.nome AS nome_paciente, " 
           + "pacientes_dados.fone AS fone_paciente, " 
           + "consultas.situação, " 
           + "consultas.OBS " 
           + "FROM consultas " 
           + "JOIN medicos ON consultas.cpf_med = medicos.cpf "
           + "JOIN dadospessoais AS medicos_dados ON medicos.cpf = medicos_dados.cpf " 
           + "JOIN pacientes ON consultas.cpf_pac = pacientes.cpf " 
           + "JOIN dadospessoais AS pacientes_dados ON pacientes.cpf = pacientes_dados.cpf " 
           + "WHERE consultas.cpf_pac ='" + cpfPaciente + "' " 
           + "ORDER BY consultas.codigo;";
     
        dados = banco.getStatement().executeQuery(SQL);
        banco.destroy();
    }catch(Exception erro){
        erro.printStackTrace();
    }
    return dados;
    }
    public String mudarSituacao(String Codigo){
         try{
         banco.ConectaBD();
         String SQL="UPDATE consultas SET situação = 'finalizado' WHERE codigo ='"+Codigo+"' AND situação = 'ATIVA';";         
         banco.getStatement().execute(SQL);
         banco.destroy();
         resposta="OK!";
     }catch(SQLException erro){
         erro.printStackTrace();
         resposta="ERRO";
     }
     return resposta;
    }

public String atualizarObs(String novoComentario,String codigoConsulta) {
    String resposta;
    try {
        banco.ConectaBD();
        String SQL = "UPDATE consultas SET OBS = CONCAT(OBS, '\n',' /" + novoComentario + "') WHERE codigo ='" + codigoConsulta + "';";
        banco.getStatement().execute(SQL);
        banco.destroy();
        resposta = "OK!";
    } catch (SQLException erro) {
        erro.printStackTrace();
        resposta = "ERRO";
    }
    return resposta;
}
public ResultSet consultarAuditoria() { 
    ResultSet dados = null; 
    try { 
        banco.ConectaBD(); 
        String SQL = "SELECT * FROM auditoria ORDER BY data_auditoria DESC;"; 
        dados = banco.getStatement().executeQuery(SQL); 
        banco.destroy();
    } 
    catch (SQLException erro) { 
        erro.printStackTrace(); 
    }return dados;
}
public ResultSet consultarAuditoriaPorCpfPaciente(String cpf) { 
    ResultSet dados = null; 
    try { 
        banco.ConectaBD(); 
        String SQL = "SELECT * FROM auditoria WHERE cpf_paciente ='"+cpf+"' ORDER BY data_auditoria DESC;";       
        dados = banco.getStatement().executeQuery(SQL); 
        banco.destroy();
    } 
    catch (SQLException erro) { 
        erro.printStackTrace(); 
    }return dados;
}
public ResultSet consultarAuditoriaPorCpfMedico(String cpf) { 
    ResultSet dados = null; 
    try { 
        banco.ConectaBD(); 
        String SQL = "SELECT * FROM auditoria WHERE cpf_medico ='"+cpf+"' ORDER BY data_auditoria DESC;";       
        dados = banco.getStatement().executeQuery(SQL); 
        banco.destroy();
    } 
    catch (SQLException erro) { 
        erro.printStackTrace(); 
    }return dados;
}
}