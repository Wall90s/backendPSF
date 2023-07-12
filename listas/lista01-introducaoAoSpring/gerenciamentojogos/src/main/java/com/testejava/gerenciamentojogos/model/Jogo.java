package com.testejava.gerenciamentojogos.model;

import java.math.BigInteger;

public class Jogo {
    private BigInteger id;
    private String nome;
    private float preco;

    public Jogo() {
    }

    public Jogo(BigInteger id, String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

}
