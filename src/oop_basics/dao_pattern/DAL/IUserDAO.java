package oop_basics.dao_pattern.DAL;

import oop_basics.dao_pattern.User;

import java.sql.SQLException;
import java.util.stream.Stream;

import java.util.Optional;

public interface IUserDAO {
    Stream<User> getAll();

    Optional<User> getById(int id) throws SQLException;

    Optional<User> getByEmail(String email) throws SQLException;

    User create(User entity) throws SQLException;

    boolean delete(int id);
}
