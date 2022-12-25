package oop_basics.dao_pattern.BLL;

import javafx.collections.ObservableList;
import oop_basics.dao_pattern.DAL.IUserDAO;
import oop_basics.dao_pattern.DAL.UserDAO;
import oop_basics.dao_pattern.DAL.factories.DAOFactory;
import oop_basics.dao_pattern.DAL.factories.IDAOFactory;
import oop_basics.dao_pattern.User;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class UserManager implements IUserManager {
    private final IUserDAO userDAO;
    private static final IDAOFactory daoFactory = new DAOFactory();

    @Inject
    public UserManager(IUserDAO userDAO) {
       //  userDAO = daoFactory.createUserDAO();
        this.userDAO = userDAO;
    }

    public List<User> getAll() throws SQLException{
        return userDAO.getAll();
    }
    public Optional<User> getByEmail(String email) throws SQLException{
        return userDAO.getByEmail(email);
    }
}
