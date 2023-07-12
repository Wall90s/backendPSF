package com.startupvarejista.estoque.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.startupvarejista.estoque.model.Produto;

@RestController
@RequestMapping
public class ProdutoController {

    public List<Produto> produtos = new ArrayList<Produto>();

    public ProdutoController() {
        produtos.add(new Produto(new BigInteger("8949461894984"), "Barrinha de Cereal", 5f));
    }

    @GetMapping("/produtos")
    public List<Produto> getAll() {
        return produtos;
    }

    @GetMapping("/produtos/{codigoDeBarras}")
    public Produto retornaPeloCodigoDeBarras(@PathVariable BigInteger codigoDeBarras) {
        for (Produto produto : produtos) {
            if (produto.getCodigoDeBarras().equals(codigoDeBarras)) {
                return produto;
            }
        }
        return null;
    }

    @PostMapping("/produtos")
    public String newProduto(@RequestBody Produto novoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigoDeBarras().equals(novoProduto.getCodigoDeBarras())) {
                return "Produto já existente";
            }
        }
        produtos.add(novoProduto);
        return "Produto " + novoProduto.getNome() + " foi adicionado ao estoque";
    }

}
