package oop_basics.assign5;

import oop_basics.assign5.menu_app.MainMenu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TestClass testClass = new TestClass();
       // List<Person> resultList = testClass.getUserList();
       MainMenu mainMenu = new MainMenu("School System", new String[]{"First Option", "Second Option","Third Option"});
       mainMenu.run();
    }
}
