package oop_basics.dao_pattern.DAL;

import oop_basics.dao_pattern.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.util.stream.Stream;

import org.jooq.Result;
import org.jooq.Schema;
import org.jooq.impl.DSL;
import org.jooq.impl.DSL.*;

import org.jooq.Record;
import static org.jooq.Table.*;
/**
 */
public class UserDAO implements IUserDAO {

    public static void main(String[] args) throws SQLException {


        IUserDAO userDAO = new UserDAO();
        var stream  = userDAO.getAll();

       stream.forEach(System.out::println);

        var resultUserId = userDAO.getById(2);

        resultUserId.ifPresent(System.out::println) ;
    }

    // Specify data source

    // implement singleton of db instance
    DatabaseConnection connection = DatabaseConnection.getInstance();

    @Override
    public Stream<User> getAll() throws SQLException {
        List<User> userStream;
        try (Connection c = connection.getConnection()) {
            // ... and then profit from the new Collection methods
            userStream = new ArrayList<>(DSL.using(c)
                    .select()
                    .from("[user]")
                    // We can use lambda expressions to map jOOQ Records
                    .fetch().into(User.class));
        }
            return userStream.stream();
        }

    @Override
    public Optional<User> getById(int id) throws SQLException {
        try (Connection cnn = connection.getConnection()) {
            Result<Record> result = DSL.using(cnn)
                    .select()
                    .from("[user]")
                    .where("id = ?",id)
                    .fetch();
            return result.isNotEmpty()
                    ? Optional.of(result.get(0).into(User.class))
                    : Optional.empty();
        }
    }

    @Override
    public Optional<User> getByEmail(String email) throws SQLException {
        try (Connection cnn = connection.getConnection()) {
            Result<Record> result = DSL.using(cnn)
                    .select()
                    .from("[user]")
                    .where("email = ?",email)
                    .fetch();
            return result.isNotEmpty()
                    ? Optional.of(result.get(0).into(User.class))
                    : Optional.empty();
        }
    }

    @Override
    public User create(User entity) throws SQLException {
            return  null;
//        try (Connection cnn = connection.getConnection()) {
//            var result = DSL.using(cnn).insertInto(Table<User);
//            return result.isNotEmpty()
//                    ? result.get(0).into(User.class)
//                    : null;
//        }
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
