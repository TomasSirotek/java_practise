package oop_basics.abstraction_inheritence;

public class Car {
    int id;
    String type;

    public Car(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void honk(){
        System.out.println("honk from parent that displays the type with id "
                + type + " " + id
        );
    }
}
