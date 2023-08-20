package com.example.lojagamesback.service;

import com.example.lojagamesback.model.Conta;
import com.example.lojagamesback.repository.ContaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {

    @Autowired
    private ContaRepository contaRepository;

    public List<Conta> getAll(){
        return contaRepository.findAll();
    }

    public Conta save(Conta novaConta){
        return contaRepository.save(novaConta);
    }
}
