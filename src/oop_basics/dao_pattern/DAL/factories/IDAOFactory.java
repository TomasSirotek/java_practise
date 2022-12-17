package oop_basics.dao_pattern.DAL.factories;

import oop_basics.dao_pattern.DAL.IUserDAO;

public interface IDAOFactory {
    IUserDAO createUserDAO();

}
