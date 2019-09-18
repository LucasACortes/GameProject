package dao;

import connection.ConnectSQL;
import domain.Usuario;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository implements IUsuarioRepository {

    @Override
    public List<Usuario> getAll() {
        ConnectSQL connection = new ConnectSQL();
        List<Usuario> usuarios = new ArrayList<>();

        try {
            Connection connected = connection.connect();
            PreparedStatement statement = connected.prepareStatement("select * from usuarios");
            ResultSet results = statement.executeQuery();

            while (results.next()) {
                String name = results.getString("name");
                String eMail = results.getString("email");
                Date verificationDate = results.getDate("verification_date");
                String password = results.getString("password") + "\n";

                usuarios.add(new Usuario(name, eMail, verificationDate, password));
            }

            connection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    @Override
    public void add(Usuario item) {

    }

    @Override
    public void add(Iterable<Usuario> item) {

    }

    @Override
    public void update(Usuario item) {

    }

    @Override
    public void remove(Usuario item) {

    }
}
