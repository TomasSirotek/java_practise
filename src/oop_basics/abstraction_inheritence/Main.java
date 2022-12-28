package oop_basics.abstraction_inheritence;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.doActivity();

        HondaCar car = new HondaCar(2, "HondaCar");
        BmwCar car2 = new BmwCar(2, "BmwCar");
        car.honk();
        car2.honk();
    }
}
