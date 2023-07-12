package com.startupvarejista.estoque.model;

import java.math.BigInteger;

public class Produto {
    private BigInteger codigoDeBarras;
    private String nome;
    private float preco;

    public Produto() {
    }

    public Produto(BigInteger codigoDeBarras, String nome, float preco) {
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.preco = preco;
    }

    public BigInteger getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(BigInteger codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
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
