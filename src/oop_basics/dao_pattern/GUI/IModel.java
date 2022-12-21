package oop_basics.dao_pattern.GUI;

import oop_basics.dao_pattern.User;

import java.sql.SQLException;
import java.util.stream.Stream;

public abstract class IModel {
    abstract Stream<User> getAll() throws SQLException;
}
