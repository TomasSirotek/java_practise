package oop_basics.better_dep_injection;

import com.google.inject.AbstractModule;

public class MyModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ICarDAO.class).to(CarDAO.class);
    }
}
