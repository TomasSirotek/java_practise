package oop_basics.dao_pattern.GUI;

import oop_basics.dao_pattern.BLL.IUserManager;
import oop_basics.dao_pattern.BLL.UserManager;
import oop_basics.dao_pattern.User;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Stream;

public class UserModel extends IModel {

    private final IUserManager userManager;

    @Inject
    public UserModel(IUserManager userManager){
        this.userManager = userManager;
    }

    @Override
    public List<User> getAll() throws SQLException {
       return userManager.getAll();
    }

}
