package oop_basics.dao_pattern.GUI;

import oop_basics.dao_pattern.BLL.UserManager;
import oop_basics.dao_pattern.User;

import java.sql.SQLException;
import java.util.stream.Stream;

public class UserModel extends IModel {

    UserManager userManager;

    public UserModel(){
        this.userManager = new UserManager();
    }

    @Override
    public Stream<User> getAll() throws SQLException {
       return userManager.getAll();
    }

}
