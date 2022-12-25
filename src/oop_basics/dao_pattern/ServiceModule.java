package oop_basics.dao_pattern;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import javafx.fxml.FXMLLoader;
import oop_basics.better_dep_injection.CarDAO;
import oop_basics.better_dep_injection.ICarDAO;
import oop_basics.dao_pattern.BLL.IUserManager;
import oop_basics.dao_pattern.BLL.UserManager;
import oop_basics.dao_pattern.DAL.IUserDAO;
import oop_basics.dao_pattern.DAL.UserDAO;
import oop_basics.dao_pattern.GUI.CurrentUser;
import oop_basics.dao_pattern.GUI.IModel;
import oop_basics.dao_pattern.GUI.LoginController;
import oop_basics.dao_pattern.GUI.UserModel;

public class ServiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FXMLLoader.class).toProvider(FXMLLoaderProvider.class);
        bind(IUserDAO.class).to(UserDAO.class);
        bind(IUserManager.class).to(UserManager.class);
        bind(IModel.class).to(UserModel.class);
        bind(CurrentUser.class).toInstance(CurrentUser.getInstance());
    }
}
