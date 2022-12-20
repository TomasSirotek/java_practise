package oop_basics.dao_pattern.DAL;

import oop_basics.dao_pattern.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Stream;

import org.jooq.Schema;
import org.jooq.impl.DSL;
import org.jooq.impl.DSL.*;

import org.jooq.Record;
import org.jooq.impl.Internal;
//import org.jooq.impl.DSL;

/**
 */
public class UserDAO implements IUserDAO {

    public static void main(String[] args) throws SQLException {
        IUserDAO userDAO = new UserDAO();
        var stream  = userDAO.getAll();

        stream.forEach(User::getEmail);
    }

    // Specify data source

    // implement singleton of db instance
    DatabaseConnection connection = DatabaseConnection.getInstance();

    @Override
    public Stream<User> getAll() throws SQLException {

        List<User> userStream;

        try (Connection c = connection.getConnection()) {
           String sql = "select * from [user]";

            // ... and then profit from the new Collection methods
            userStream = new ArrayList<>(DSL.using(c)
                    .fetch(sql)
                    // We can use lambda expressions to map jOOQ Records
                    .map(this::createUser));
        }
            return userStream.stream();
        }




    private User createUser(Record record)  {
        return new User(
                record.getValue("id", Integer.class),
                record.getValue("user_name", String.class),
                record.getValue("email", String.class),
                record.getValue("password_hash", String.class)
        );
//        return new User(rs.getInt("id"),
//                rs.getString("user_name"),
//                rs.getString("email"),
//                rs.getString("password_hash")
//        );
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
                return Optional.empty();
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
