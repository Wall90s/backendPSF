package com.testejava.gerenciamentojogos.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testejava.gerenciamentojogos.model.Jogo;

@RestController
@RequestMapping("/jogos")
public class JogoController {
    List<Jogo> jogos = new ArrayList<Jogo>();

    public JogoController() {
        jogos.add(new Jogo(new BigInteger("9547621957873"), "Inscryption", 29.99f));
        jogos.add(new Jogo(new BigInteger("7986563443548"), "Donut County", 10.49f));
        jogos.add(new Jogo(new BigInteger("1823216140489"), "The Room Three", 3.09f));
    }

    @GetMapping
    public List<Jogo> getAll() {
        return jogos;
    }

    @GetMapping("/{id}")
    public Jogo getById(@PathVariable BigInteger id) {
        for (Jogo jogo : jogos) {
            if (jogo.getId().equals(id)) {
                return jogo;
            }
        }
        return null;
    }

    @GetMapping("/menor-preco")
    public Jogo jogoComMenorPreco() {
        Jogo jogoComMenorPreco = jogos.get(0);

        for (Jogo jogo : jogos) {
            if (jogo.getPreco() <= jogoComMenorPreco.getPreco()) {
                jogoComMenorPreco = jogo;
            }
        }

        return jogoComMenorPreco;
    }

    @PostMapping
    public String addJogo(@RequestBody Jogo novoJogo){
        for (Jogo jogo : jogos) {
            if(jogo.getId().equals(novoJogo.getId())){
                return "Jogo já existente";
            }
        }
        jogos.add(novoJogo);
        return "Jogo " + novoJogo.getNome() + " foi adicionado ao catálogo!";
    }
}
