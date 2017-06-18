/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistema.model;

/**
 *
 * @author jairo
 */
public class Pessoa {

    private int registro;
    private String nome;
    private char sexo;
    private String escolaridade;

    public Pessoa() {
    }

    public Pessoa(int registro, String nome, char sexo, String escolaridade) {
        this.registro = registro;
        this.nome = nome;
        this.sexo = sexo;
        this.escolaridade = escolaridade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Reg: " + getRegistro() + " Nome: " + getNome() + ""
                + " Sexo: " + getSexo() + " Escolaridade " + getEscolaridade();
    }
}
