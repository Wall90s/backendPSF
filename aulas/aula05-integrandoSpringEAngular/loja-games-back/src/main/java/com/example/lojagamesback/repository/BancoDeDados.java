package com.example.lojagamesback.repository;

import com.example.lojagamesback.model.Jogo;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BancoDeDados {
    private List<Jogo> jogos = new ArrayList<>();

    public BancoDeDados() {
        jogos.add(
                new Jogo(
                        1,
                        "A Lenda de Zelda",
                        "Mobile Version note: this is the remake of the Nintendo Entertainment System (NES) one. Happy Gaming The Legend of Zelda Mobile",
                        0.0,
                        "https://prodigits.co.uk/thumbs/java-games/thumbs/All/Games/s/1346616544.jpg")
        );
        jogos.add(
                new Jogo(
                        2,
                        "Wattam",
                        "Wattam is a game about the joys of friendship and discovery, from the imagination of Keita Takahashi (creator of Katamari Damacy and Noby Noby Boy) and developer Funomena.",
                        49.99,
                        "https://cdn.cloudflare.steamstatic.com/steam/apps/702680/header.jpg?t=1689529808")
        );
    }

    public List<Jogo> findAll(){
        return jogos;
    }
}
