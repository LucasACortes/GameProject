package controllers;

import dao.UsuarioRepository;
import domain.Usuario;

import java.util.List;

public class UsuarioController {

    UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = usuarioRepository.getAll();
        return usuarios;
    }
}
