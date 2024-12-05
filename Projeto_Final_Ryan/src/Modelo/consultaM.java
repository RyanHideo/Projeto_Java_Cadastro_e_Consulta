/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Ryan
 */
public class consultaM {
    private String codigo;
    private String cpf_med;
    private String cpf_pac;
    private String situacao;
    private String obs;

    public consultaM(String codigo, String cpf_med, String cpf_pac, String situacao, String obs) {
        this.codigo = codigo;
        this.cpf_med = cpf_med;
        this.cpf_pac = cpf_pac;
        this.situacao = situacao;
        this.obs = obs;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCpf_med() {
        return cpf_med;
    }

    public void setCpf_med(String cpf_med) {
        this.cpf_med = cpf_med;
    }

    public String getCpf_pac() {
        return cpf_pac;
    }

    public void setCpf_pac(String cpf_pac) {
        this.cpf_pac = cpf_pac;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }
    
    
}
