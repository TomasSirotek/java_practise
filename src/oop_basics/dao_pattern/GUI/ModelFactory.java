package oop_basics.dao_pattern.GUI;

import oop_basics.binary_search.User;

public class ModelFactory {
    public static IModel getModel(String type){
        if (type.equals("user")) {
            return new UserModel();
        } else {
            throw new IllegalArgumentException("nono");
        }
    }
}
