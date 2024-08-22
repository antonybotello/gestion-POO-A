import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    private static ConnectionManager instance;
    private Connection connection;

    private ConnectionManager(){
        try{
            String url="jdbc:mysql://localhost:3306/gestor_bd";
            String user="root";
            String password="";
            connection= DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static synchronized ConnectionManager getInstance(){
        if(instance== null){
            instance= new ConnectionManager();
        }
        return instance;
    }

    public Connection getConnection(){
        return connection;
    }
}
