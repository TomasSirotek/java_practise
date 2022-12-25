package oop_basics.dao_pattern.GUI;


import oop_basics.dao_pattern.BLL.IUserManager;
import oop_basics.dao_pattern.BLL.UserManager;
import oop_basics.dao_pattern.User;

import java.sql.SQLException;
import java.util.Optional;

/**
 * Singleton design pattern because there can be only one
 */
public class CurrentUser {

    private IUserManager userManager;
    // Private constructor to prevent direct instantiation

    // Private static variable to hold the singleton instance
    private static CurrentUser instance;
   // private static UserManager userManager;

    // Private variables to hold the user's name and password
    private String email;
    private String password;

    private boolean isLoggedIn;

    // Public static method to get the singleton instance
    public static CurrentUser getInstance() {
        if (instance == null) {
            instance = new CurrentUser();
        }
        return instance;
    }

    // Public getter and setter methods for the name and password
    public String getEmail() {
        return email;
    }

    public void setEmail(String name) {
        this.email = name;
    }

    public void login(String email,String password){
        this.email = email;
        this.password = password;
        this.isLoggedIn = true;
    }

    public void logout(){
        this.email = null;
        this.password = null;
        this.isLoggedIn = false;
    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    // Method to check whether the user is authorized
    public boolean isAuthorized() throws SQLException {
        // Check the name and password against some criteria to determine
        // whether the user is authorized
        Optional<User> user = userManager.getByEmail(this.email);

        return user.map(User::getEmail).orElseThrow().equals(this.email) &&
                user.map(User::getPassword_hash).orElseThrow().equals(this.password);
    }

    public boolean isActive() throws SQLException {
        // Check if user is active
        // whether the user is authorized
        Optional<User> user = userManager.getByEmail(this.email);

        return user.map(User::getEmail).orElseThrow().equals(this.email) &&
                user.map(User::getPassword_hash).orElseThrow().equals(this.password);
    }



}
