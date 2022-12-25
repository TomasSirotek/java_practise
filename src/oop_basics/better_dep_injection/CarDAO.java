package oop_basics.better_dep_injection;

import com.google.inject.Provides;

import java.util.List;

public class CarDAO implements ICarDAO{

    public List<Car> getAll() {
        return List.of(
                new Car("Car 1"),
                new Car("Car 2"),
                new Car("Car 3")
                );
    }
}
