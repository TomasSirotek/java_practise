package oop_basics.better_dep_injection;

import java.util.List;

public class CarDAO implements ICarDAO{
    @Override
    public List<Car> getAll() {
        return List.of(
                new Car("Toyta"),
                new Car("VOLVO")
        );
    }
}
