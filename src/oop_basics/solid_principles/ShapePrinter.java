package oop_basics.solid_principles;

import java.util.List;

public class ShapePrinter {

    // Single responsibility ( does only one thing that is needed )
    public String json(int sum){
        return "{shapesSum: %s}".formatted(sum);
    }

    public String csv(int sum){
        return "shapesSum, %s".formatted(sum);
    }

}
