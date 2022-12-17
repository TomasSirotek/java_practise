package oop_basics.dao_pattern.BLL;

import oop_basics.dao_pattern.DAL.factories.DAOFactory;
import oop_basics.dao_pattern.DAL.factories.IDAOFactory;

public class UserManager {
    // -> inject DAO
    private IDAOFactory daoFactory;

    public UserManager(IDAOFactory daoFactory) {
        this.daoFactory = daoFactory;
    }

    public boolean createUser(){
        var test = this.daoFactory.createUserDAO();
        test.getAll();
        return false;
    }

    // do login
}
