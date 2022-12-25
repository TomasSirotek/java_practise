package oop_basics.dao_pattern.DAL;

import oop_basics.dao_pattern.User;
import org.jooq.Record;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;

import java.util.Optional;

public interface IUserDAO {
    List<User> getAll() throws SQLException;

    Optional<User> getById(int id) throws SQLException;

    Optional<User> getByEmail(String email) throws SQLException;

    User create(User entity) throws SQLException;

    boolean delete(int id);
}
