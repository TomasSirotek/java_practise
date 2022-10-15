package oop_basics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


//        Rectangle r = new Rectangle(8,8);
//        r.printArea();
//
//        System.out.println(r.getHeight() + r.getWidth());
//        System.out.println(r.getArea());

        String[] sa = new String[5];
        ArrayList<String> sal = new ArrayList<String>();
        sal.add("Testing");
        sal.add("Furniture");
        sal.add("What is going onnn");

        Student s = new Student("Tomas","02/02/1970",false);
        s.setCourse(new Course("Computer Science","Beginner"));



    }
}
