package com.example.lojagamesback.service;

import com.example.lojagamesback.model.Categoria;
import com.example.lojagamesback.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAll(){
        return categoriaRepository.findAll();
    }

    public Categoria save(Categoria novaCategoria){
        return categoriaRepository.save(novaCategoria);
    }
}
