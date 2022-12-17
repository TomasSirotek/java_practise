package oop_basics.dao_pattern;

import java.util.Optional;
import java.util.stream.Stream;

public class UserDAO implements IUserDAO {

    // Specify data source

    @Override
    public Stream<Entity.User> getAll() {
        return null;
    }

    @Override
    public Optional<Entity.User> getById() {
        return Optional.empty();
    }

    @Override
    public Entity.User create(Entity.User entity) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
