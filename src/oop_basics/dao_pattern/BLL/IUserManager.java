package oop_basics.dao_pattern.BLL;

import oop_basics.dao_pattern.DAL.IUserDAO;
import oop_basics.dao_pattern.DAL.factories.DAOFactory;
import oop_basics.dao_pattern.DAL.factories.IDAOFactory;
import oop_basics.dao_pattern.User;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface IUserManager {
    List<User> getAll() throws SQLException;
    Optional<User> getByEmail(String email) throws SQLException;
}
