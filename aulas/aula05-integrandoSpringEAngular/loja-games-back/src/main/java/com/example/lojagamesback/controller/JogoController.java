package com.example.lojagamesback.controller;

import com.example.lojagamesback.model.Jogo;
import com.example.lojagamesback.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jogos")
@CrossOrigin("http://localhost:4200/")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @GetMapping
    public ResponseEntity<List<Jogo>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(jogoService.getAll());
    }

    @PostMapping
    public ResponseEntity<Jogo> save(@RequestBody Jogo novoJogo){
        if(novoJogo == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        jogoService.save(novoJogo);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoJogo);
    }

    @PutMapping("/favoritar/{id}")
    public ResponseEntity<Jogo> favoritar(@PathVariable int id){
        Jogo jogo = jogoService.favoritar(id);
        return ResponseEntity.status(HttpStatus.OK).body(jogo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        jogoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
