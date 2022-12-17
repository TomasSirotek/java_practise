package oop_basics.dao_pattern.DAL.factories;

import oop_basics.dao_pattern.DAL.IUserDAO;
import oop_basics.dao_pattern.DAL.UserDAO;

public class DAOFactory implements IDAOFactory{

    @Override
    public IUserDAO createUserDAO() {
        return new UserDAO();
    }
}
