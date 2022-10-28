package oop_basics.better_dep_injection;

public class CarService {
    private CarDAO carDAO;

    public CarService(){
        this.carDAO = new CarDAO();
    }
}
