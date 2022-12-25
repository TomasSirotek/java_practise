package oop_basics.hashsets;

import oop_basics.dao_pattern.Role;
import org.jooq.Records;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("asda");
        System.out.println("asda");
        System.out.println("asda");
        System.out.println("asda");
        System.out.println("asda");

        HashMap<Integer,Role> roleHashMap = new HashMap<>();


        record Car(int id,String brand,String type,int wheels){}

        Car first = new Car(1,"Toyta","4 wheel",2);

        List<Car> carList = new ArrayList<>();
        carList.add(first);

   }
}
