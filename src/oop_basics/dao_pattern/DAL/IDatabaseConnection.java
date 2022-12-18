package oop_basics.dao_pattern.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDatabaseConnection {
    Connection getConnection() throws SQLException;
//    void executeQuery(String query) throws SQLException;
//    ResultSet getResultSet();
}
