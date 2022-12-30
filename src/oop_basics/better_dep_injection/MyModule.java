package oop_basics.better_dep_injection;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
       // bind(ICarDAO.class).annotatedWith(Names.named("car_dao")).to(CarDAO.class);
        bind(ICarDAO.class).to(CarDAO.class);
    }
}
