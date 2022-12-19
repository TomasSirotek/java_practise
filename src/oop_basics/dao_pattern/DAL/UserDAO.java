package oop_basics.dao_pattern.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import oop_basics.dao_pattern.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 */
public class UserDAO implements IUserDAO {

    // Specify data source

    // implement singleton of db instance
    DatabaseConnection connection = DatabaseConnection.getInstance();

    @Override
    public Stream<User> getAll() {
        ResultSet rs = null;
        try (Connection cnn = connection.getConnection()) {
            String sql = "SELECT * FROM [user]";
            var preparedStatement = cnn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();

            return mapRsToStream(rs);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Stream<User> mapRsToStream(ResultSet set){
        return Stream.generate(() -> {
            try{
                if(set.next()){
                    return createUser(set);
                }else {
                    return null;
                }
            }catch (SQLException e){
                throw new RuntimeException(e);
            }
        }).takeWhile(p -> p != null);
    }

    private User createUser(ResultSet rs) throws SQLException {
        return new User(rs.getInt("id"),
                rs.getString("user_name"),
                rs.getString("email"),
                rs.getString("password_hash")
        );
    }


    @Override
    public Optional<User> getById(int id) throws SQLException {
        ResultSet resultSet = null;
        try (Connection cnn = connection.getConnection()) {
            String sql = "SELECT * FROM [user] WHERE id = ?";
            var statement = cnn.prepareStatement(sql);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(createUser(resultSet));
            } else {
                return Optional.empty();
            }
        }
    }

    @Override
    public Optional<User> getByEmail(String email) throws SQLException {
        ResultSet resultSet = null;
        try (Connection cnn = connection.getConnection()) {
            String sql = "SELECT * FROM [user] WHERE email = ?";
            var statement = cnn.prepareStatement(sql);
            statement.setString(1, email);
            resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return Optional.of(createUser(resultSet));
            } else {
                return Optional.empty();
            }
        }
    }

    @Override
    public User create(User entity) throws SQLException {
        if(getById(entity.getId()).isPresent()){
            // return already exist
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
