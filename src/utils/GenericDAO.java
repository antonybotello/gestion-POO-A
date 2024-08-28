package utils;
import java.sql.SQLException;
import java.util.List;

public interface GenericDAO<T> {
    void add(T obj) throws SQLException;
    T getById(int id) throws SQLException ;
    List<T> getAll() throws SQLException ;
    void update(T obj) throws SQLException;
    void delete(int id) throws SQLException;
}
