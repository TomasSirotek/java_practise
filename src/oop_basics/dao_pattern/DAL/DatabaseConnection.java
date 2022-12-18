package oop_basics.dao_pattern.DAL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;


public class DatabaseConnection implements IDatabaseConnection{

    private static DatabaseConnection instance;

    private static SQLServerDataSource dataSource;

    private DatabaseConnection() {
        dataSource = new SQLServerDataSource();

        dataSource.setDatabaseName("dev_local");
        dataSource.setUser("sa");
        dataSource.setPassword("ADMIN_$TROP");
        dataSource.setServerName("localhost");
        dataSource.setPortNumber(1433);
        dataSource.setTrustServerCertificate(true);
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    @Override
    public Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

//    @Override
//    public void executeQuery(String query) throws SQLException {
//        PreparedStatement statement = connection.prepareStatement(query);
//        statement.executeQuery(query);
//    }
//    @Override
//    public ResultSet getResultSet() {
//        return null;
//    }
//
//    private static Properties loadConfigFile() throws IOException {
//        try(FileInputStream fs = new FileInputStream("MSSQL_FILE")){
//            Properties properties = new Properties();
//            properties.load(fs);
//            return properties;
//        }
//    }
}
