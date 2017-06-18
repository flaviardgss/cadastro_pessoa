package br.com.sistema.model;

import javax.swing.JOptionPane;

public class Person {

    private int registro;
    private String nome;
    private char sexo;
    private String escolaridade;

    public Person() {
    }

    public Person(int registro, String nome, char sexo, String escolaridade) {
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
        return "* ID: " + getRegistro()
                + " \tNome: " + getNome()
                + " \tSexo: " + getSexo()
                + " \tNível: " + getEscolaridade();
    }
}
