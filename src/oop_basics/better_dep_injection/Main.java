package oop_basics.better_dep_injection;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jooq.DAO;

import java.util.List;


public class Main {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(
                new MyModule());
        // Bootstrap the application by creating an instance of the server then
        // start the server to handle incoming requests.

        CarService carService = injector.getInstance(CarService.class);

        carService
                .getAll()
                .forEach(System.out::println);
    }
}
