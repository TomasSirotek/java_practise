package oop_basics.dao_pattern.GUI;


/**
 * Singleton design pattern because there can be only one
 */
public class CurrentUser {
    // Private constructor to prevent direct instantiation
    private CurrentUser() {}

    // Private static variable to hold the singleton instance
    private static CurrentUser instance;

    // Private variables to hold the user's name and password
    private String email;
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to check whether the user is authorized
    public boolean isAuthorized() {
        // Check the name and password against some criteria to determine
        // whether the user is authorized
        return email.equals("admin") && password.equals("password");
    }



}
