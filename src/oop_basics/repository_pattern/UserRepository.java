package oop_basics.repository_pattern;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements IUserRepository<Entity,Integer> {

    private final DataSource dataSource;

    public UserRepository(DataSource source){
        this.dataSource = source;
    }

    @Override
    public List<Entity> read() {
        return new ArrayList<>();
    }

    @Override
    public Entity readById(Integer id) {
        return null;
    }

    @Override
    public Entity create(Entity entity) {
        return null;
    }

    @Override
    public Entity update(Entity entity) {
        return null;
    }

    @Override
    public Entity delete(Entity entity) {
        return null;
    }
}
