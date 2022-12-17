package oop_basics.repository_pattern;

import java.util.List;

public interface IUserRepository<T,K> {
    List<T> read();
    T readById(K id);
    T create(T entity);
    T update(T entity);
    T delete(T entity);
}
