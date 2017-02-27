/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula39;

/**
 *
 * @author Code36u4r60
 */
public class Pessoa {

    private String nome;
    private String endereco;
    private String telefone;
    private String cpf;
    private String telemovel;

    public String nomeVisibilidade;
    
    public Pessoa() {
    }

    public Pessoa(String nome, String endereco, String telefone, String cpf, String telemovel) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.telemovel = telemovel;
    }

    
    //<editor-fold desc="Getter's and Setter's...">
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        this.telemovel = telemovel;
    }

    //</editor-fold>
}
