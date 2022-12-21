package oop_basics.dao_pattern.BLL;

import javafx.collections.ObservableList;
import oop_basics.dao_pattern.DAL.IUserDAO;
import oop_basics.dao_pattern.DAL.UserDAO;
import oop_basics.dao_pattern.DAL.factories.DAOFactory;
import oop_basics.dao_pattern.DAL.factories.IDAOFactory;
import oop_basics.dao_pattern.User;

import java.sql.SQLException;
import java.util.Optional;
import java.util.stream.Stream;

public class UserManager {
    private final IUserDAO userDAO;

    public UserManager() {
        IDAOFactory daoFactory = new DAOFactory();
        userDAO = daoFactory.createUserDAO();
    }

    public Stream<User> getAll() throws SQLException{
        return userDAO.getAll();
    }
    public Optional<User> getByEmail(String email) throws SQLException{
        return userDAO.getByEmail(email);
    }
}
