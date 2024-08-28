package controller;

import java.sql.SQLException;
import java.util.List;

import model.Usuario;
import model.UsuarioImplDAO;

public class UsuarioController {
    UsuarioImplDAO usuariosDAO = new UsuarioImplDAO();

    public void agregarUsuario(Usuario usuario)throws SQLException {
        try{
        usuariosDAO.add(usuario);
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al agregar usuario!");
        }
    }

    public void listarUsuarios() throws SQLException {
        try {
            List<Usuario> usuarios = usuariosDAO.getAll();
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al listar usuarios!");
        }
    }
}
