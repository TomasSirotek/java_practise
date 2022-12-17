package oop_basics.dao_pattern;

import java.util.stream.Stream;

import java.util.Optional;

public interface IUserDAO {
    Stream<Entity.User> getAll();

    Optional<Entity.User> getById();

    Entity.User create(Entity.User entity);

    boolean delete(int id);
}
