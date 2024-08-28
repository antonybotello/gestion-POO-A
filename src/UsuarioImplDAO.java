import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioImplDAO implements GenericDAO<Usuario> {

    private Connection connection;

    
    public UsuarioImplDAO() {
        this.connection = ConnectionManager.getInstance().getConnection();
    }

    @Override
    public void add(Usuario obj) throws SQLException{

        String query= "INSERT INTO usuarios (documento,nombres,apellidos,correo)"+
                      "VALUES(?,?,?,?)";
        try(PreparedStatement stmt= connection.prepareStatement(query)){
            stmt.setString(1, obj.getDocumento());
            stmt.setString(2, obj.getNombres());
            stmt.setString(3, obj.getApellidos());
            stmt.setString(4, obj.getCorreo());

        }
        
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        // DELETE FROM Usuarios WHERE id=id
        
    }

    @Override
    public List<Usuario> getAll() throws SQLException {
        List<Usuario> usuarios= new ArrayList<>();
        // SELECT * FROM Usuarios
        String query= "SELECT * FROM usuarios";
        try(Statement stmt= connection.createStatement(); ResultSet rs = stmt.executeQuery(query);){
            while (rs.next()){
                usuarios.add(new Usuario(rs.getInt("usuarioId"),
                                         rs.getString("documento"),
                                         rs.getString("nombres"),
                                         rs.getString("apellidos"),
                                         rs.getString("correo")
                                         
                                         ));
            }

        }
        
        return usuarios;
    }

    @Override
    public Usuario getById(int id) {
        // TODO Auto-generated method stub
        // SELECT * FROM Usuarios WHERE id=id
        return null;
    }

    @Override
    public void update(Usuario obj) {
        // TODO Auto-generated method stub
        // UPDATE Usuarios SET nombre= obj.getNombre WHERE id=obj.getId
        
    }
    
}
