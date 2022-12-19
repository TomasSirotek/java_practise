package oop_basics.hashMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        class User {
//            int id;
//            String name;
//            List<String> roles;
//
//            public User(int id,String name){
//                this.id = id;
//                this.name = name;
//                this.roles = List.of("Administrator","User");
//            }
//
//            @Override
//            public String toString() {
//                return "User{" +
//                        "id=" + id +
//                        ", name='" + name + '\'' +
//                        ", roles=" + roles +
//                        '}';
//            }
//        }
//
//        // KEY / VALUE Pair
//
//        HashMap<Integer,User> userRole = new HashMap<>();
//        userRole.put(0,new User(0,"Tomas"));
//        userRole.put(1,new User(0,"Tomas"));
//
//
//        System.out.println(userRole);
//        userRole.forEach((key, value) -> {
//            System.out.println("Key: " + key + ", Value: " + " " + value.name + " " + value.roles.get(0));
//        });

       // Does not care about the order
        HashMap<String,Integer> userId = new HashMap<>();

        userId.put("Tomas",2934);
        userId.put("Adam",3556);
        userId.put("Zelda",2347);

            System.out.println(userId);

        System.out.println("--------");

        System.out.println(userId.get("Zelda"));
        System.out.println(userId.containsKey("Adam"));
        System.out.println(userId.containsValue(2345));
        userId.put("Rob ",6666);

        // only replace only if exist
        userId.replace("Troy",2);
        System.out.println(userId);

        // only adds if does not exist already
        userId.putIfAbsent("Tomas",222);


    }
}
