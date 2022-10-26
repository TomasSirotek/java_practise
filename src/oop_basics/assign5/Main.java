package oop_basics.assign5;

import oop_basics.assign5.menu_app.MainMenu;

public class Main {
    public static void main(String[] args) {
        TestClass testClass = new TestClass();
       // List<Person> resultList = testClass.getUserList();
       MainMenu mainMenu = new MainMenu("School System", new String[]{"test", "test"});
       mainMenu.run();
    }
}
