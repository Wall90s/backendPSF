package com.example.lojagamesback.controller;

import com.example.lojagamesback.model.Categoria;
import com.example.lojagamesback.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
@CrossOrigin("http://localhost:4200/")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<List<Categoria>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(categoriaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Categoria> save(@RequestBody Categoria novaCategoria){
        if(novaCategoria == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        categoriaService.save(novaCategoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaCategoria);
    }
}
