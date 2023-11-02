/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eeepmw.cadastroalunos;

/**
 *
 * @author levi
 */
public class Aluno {
    
    private int matricula;
    private String nome;
    private String dataNascimento;
    private String sexo;
    private String telefone;
    private String endereco;

    public Aluno(int matricula, String nome, String dataNascimento, String sexo, String telefone, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    
    
    
}
