package com.example.lojagamesback.service;

import com.example.lojagamesback.model.Jogo;
import com.example.lojagamesback.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> getAll(){
        return jogoRepository.findAll();
    }

    public Jogo save(Jogo novoJogo){
        return jogoRepository.save(novoJogo);
    }
}
