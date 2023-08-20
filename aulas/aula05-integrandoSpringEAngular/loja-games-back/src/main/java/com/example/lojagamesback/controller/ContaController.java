package com.example.lojagamesback.controller;

import com.example.lojagamesback.model.Conta;
import com.example.lojagamesback.service.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contas")
public class ContaController {

    @Autowired
    private ContaService contaService;

    @GetMapping
    public ResponseEntity<List<Conta>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(contaService.getAll());
    }

    @PostMapping
    public ResponseEntity<Conta> save(@RequestBody Conta novaConta){
        if (novaConta == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        contaService.save(novaConta);
        return ResponseEntity.status(HttpStatus.CREATED).body(novaConta);
    }
}
