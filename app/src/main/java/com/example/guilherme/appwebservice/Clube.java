package com.example.guilherme.appwebservice;

/**
 * Created by Guilherme on 26/04/2017.
 */

public class Clube {
    private String nome;
    private int ano;

    public Clube(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Clube(String nome, int ano) {

        this.nome = nome;
        this.ano = ano;
    }
}
