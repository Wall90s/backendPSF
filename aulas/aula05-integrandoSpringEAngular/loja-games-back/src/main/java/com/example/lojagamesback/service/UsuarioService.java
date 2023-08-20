package com.example.lojagamesback.service;

import com.example.lojagamesback.model.Usuario;
import com.example.lojagamesback.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> getAll(){
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario novoUsuario){
        return usuarioRepository.save(novoUsuario);
    }
}
