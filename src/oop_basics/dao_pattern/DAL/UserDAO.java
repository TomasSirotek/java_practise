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
import static org.jooq.impl.DSL.table;

/**
 */
public class UserDAO implements IUserDAO {

    public static void main(String[] args) throws SQLException {


        IUserDAO userDAO = new UserDAO();
//        var stream  = userDAO.getAll();
//
//       stream.forEach(System.out::println);
//
//        var resultUserId = userDAO.getById(2);
//
//        resultUserId.ifPresent(System.out::println) ;

        var email = userDAO.getByEmail("dadin@gmail.com");
        email.ifPresent(System.out::println);
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
                    .from(table("[user]"))
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
            return DSL.using(cnn)
                    .select()
                    .from("[user]")
                    .where("email = ?",email)
                    .fetchOptional(it -> new User(
                            (Integer)it.getValue("id"),
                            (String) it.getValue("user_name"),
                            (String) it.getValue("email"),
                            (String) it.getValue("password_hash")
                    ));
        }
    }

    @Override
    public User create(User entity) throws SQLException {
        try (Connection cnn = connection.getConnection()) {
//            InsertValuesStep3<AuthorRecord, Integer, String, String> step =
//                    create.insertInto(AUTHOR, AUTHOR.ID, AUTHOR.FIRST_NAME, AUTHOR.LAST_NAME);
//            step.values("A", "B", "C");
//            var result = DSL.using(cnn).insertInto("table").values;
//            return result.isNotEmpty()
//                    ? result.get(0).into(User.class)
//                    : null;
        }
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
