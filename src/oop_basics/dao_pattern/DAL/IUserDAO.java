package oop_basics.dao_pattern.DAL;

import oop_basics.dao_pattern.User;

import java.util.stream.Stream;

import java.util.Optional;

public interface IUserDAO {
    Stream<User> getAll();

    Optional<User> getById();

    User create(User entity);

    boolean delete(int id);
}
