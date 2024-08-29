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
    public void actualizarUsuario(Usuario usuario) throws SQLException {
        try {
            usuariosDAO.update(usuario);
            System.err.println("Exito al actualizar usuario!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al actualizar usuario!");
        }
    }
    public void eliminarUsuario(int id) throws SQLException {
        try {
            usuariosDAO.delete(id);
            System.err.println("Exito al eliminar usuario!");

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error al eliminar usuarios!");
        }
    }
    public Usuario obtenerUsuarioPorId(int id) throws SQLException {
        try {
            Usuario usuario= usuariosDAO.getById(id);
           if(usuario!=null){
            return usuario;
           }else{
            System.err.println("Usuario no encontrado con el ID: "+ id);
            return null;

           }

        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error buscar el usuario!");
            return null;
        }
    }


}
