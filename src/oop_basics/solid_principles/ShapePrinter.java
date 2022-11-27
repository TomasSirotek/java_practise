package oop_basics.solid_principles;

import java.util.List;

public class ShapePrinter {

    // Single responsibility ( does only one thing that is needed )

   private final IAreaCalculator areaCalculator;

    public ShapePrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes){
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv (List<Shape> shapes){
        return "shapesSum, %s".formatted(areaCalculator.sum(shapes));
    }

}
