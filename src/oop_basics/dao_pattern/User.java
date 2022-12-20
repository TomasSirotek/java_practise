package oop_basics.dao_pattern;

import java.util.List;

public class User {

    private int id;
    private String user_name;

    private String email;

    private String password_hash;

    private List<Role> roles;

    public User(int id, String name, String email, String passwordHash) {
        this.id = id;
        this.user_name = name;
        this.email = email;
        password_hash = passwordHash;
    }

    @Override
    public String toString() {
        return id + " " + user_name + " " + email + " " + password_hash;
    }

    public String getName() {
        return user_name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public void setName(String name) {
        this.user_name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}

