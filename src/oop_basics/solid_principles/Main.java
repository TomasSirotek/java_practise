package oop_basics.solid_principles;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        IAreaCalculator areaCalculator = new AreaCalculator();
        Circle c = new Circle(10);
        Square s = new Square(10);
        Cube cube = new Cube();

        // Single responsibility seperation of methods that were uneccesery
        ShapePrinter sp = new ShapePrinter(areaCalculator);


        List<Shape> shapes = List.of(c,s,c);
        int sum = areaCalculator.sum(shapes);
        System.out.println(sp.json(shapes));
        System.out.println(sp.csv(shapes));


    }
}
