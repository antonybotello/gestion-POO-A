import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        UsuarioImplDAO usuariosDAO= new UsuarioImplDAO();
        try{
        List<Usuario> usuarios= usuariosDAO.getAll();
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }catch(SQLException e){
        e.printStackTrace();
    }

    }
}
