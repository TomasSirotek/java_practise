package oop_basics.dao_pattern.DAL;

import java.sql.Connection;
import java.sql.SQLException;

public interface IDatabaseConnection {
    Connection getConnection() throws SQLException;
    // void executeQuery(Connection connection, String query) throws SQLException;

}
