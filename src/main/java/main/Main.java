package main;

import controllers.UsuarioController;
import domain.Usuario;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        UsuarioController u = new UsuarioController();

        List<Usuario> usuarios = u.getUsuarios();

        System.out.println(usuarios.toString() + "\n");
    }
}
