package oop_basics.dao_pattern.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import oop_basics.dao_pattern.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * THIS IS IN THE MEMORT
 */
public class UserDAO implements IUserDAO {

    // Specify data source

    // implement singleton of db instance
    DatabaseConnection connection = DatabaseConnection.getInstance();

    @Override
    public Stream<User> getAll() {
        try(Connection cnn = connection.getConnection()){

            String sql = "SELECT * FROM user";

            PreparedStatement  preparedStatement = cnn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()){
                rs.getInt("id");
                rs.getString("string");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public Optional<User> getById() {
        return Optional.empty();
    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
