package oop_basics.dao_pattern.DAL;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import oop_basics.dao_pattern.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * THIS IS IN THE MEMORT
 */
public class UserDAO implements IUserDAO {
    public static void main(String[] args) {
        IUserDAO userDAO = new UserDAO();
        var test = userDAO.getAll();
    }

    // Specify data source

    // implement singleton of db instance
    DatabaseConnection connection = DatabaseConnection.getInstance();

    @Override

    public Stream<User> getAll() {
        try(Connection cnn = connection.getConnection()){

            String sql = "SELECT * FROM [user]";
            PreparedStatement  preparedStatement = cnn.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            return StreamSupport.stream(new Spliterators.AbstractSpliterator<User>(Long.MAX_VALUE,
                    Spliterator.ORDERED) {
                @Override
                public boolean tryAdvance(Consumer<? super User> action) {
                    try {
                        if(!rs.next()){
                            return false;
                        }
                        action.accept(createUser(rs));
                        return true;
                    } catch (SQLException e) {
                        throw new RuntimeException(e);
                    }
                }

            },false);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private User createUser(ResultSet rs) throws SQLException {
        return new User(rs.getInt("id"),
                rs.getString("user_name"),
                rs.getString("email"),
                rs.getString("password_hash")
        );
    }

    @Override
    public Optional<User> getById() {
        return Optional.empty();
    }

    @Override
    public User create(User entity) {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }
}
