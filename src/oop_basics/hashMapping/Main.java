package oop_basics.hashMapping;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> idWithName = new HashMap<>();
        idWithName.put(3,"test");
        idWithName.remove(0);
    }
}
