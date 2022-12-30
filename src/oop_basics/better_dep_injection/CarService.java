package oop_basics.better_dep_injection;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

public class CarService {
    private final ICarDAO carDAO;
    @Inject
    public CarService(@CarDAOAnn ICarDAO carDAO){
        this.carDAO = carDAO;
    }

    public List<Car> getAll() {
        return carDAO.getAll();
    }
}
