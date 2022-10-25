package oop_basics.assign5;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        List<Person> resultList = testClass.getUserList();

        for (Person u : resultList
             ) {
            System.out.println(u.toString());
        }
    }
}
