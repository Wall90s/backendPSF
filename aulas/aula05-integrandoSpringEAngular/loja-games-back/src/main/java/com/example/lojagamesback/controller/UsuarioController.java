package com.example.lojagamesback.controller;

import com.example.lojagamesback.model.Usuario;
import com.example.lojagamesback.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    private ResponseEntity<List<Usuario>> getAll(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.getAll());
    }

    @PostMapping
    private ResponseEntity<Usuario> save(@RequestBody Usuario novoUsuario){
        if (novoUsuario == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        usuarioService.save(novoUsuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
    }
}
