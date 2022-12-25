package oop_basics.dao_pattern;

import com.google.inject.AbstractModule;
import oop_basics.better_dep_injection.CarDAO;
import oop_basics.better_dep_injection.ICarDAO;
import oop_basics.dao_pattern.BLL.UserManager;
import oop_basics.dao_pattern.DAL.IUserDAO;
import oop_basics.dao_pattern.DAL.UserDAO;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IUserDAO.class).to(UserDAO.class);
        bind(UserManager.class).to(UserManager.class);
    }
}
