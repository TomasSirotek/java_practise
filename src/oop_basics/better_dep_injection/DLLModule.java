package oop_basics.better_dep_injection;

import com.google.inject.AbstractModule;
import javafx.fxml.FXMLLoader;
import oop_basics.dao_pattern.FXMLLoaderProvider;

public class DLLModule extends AbstractModule {
    @Override
    protected void configure() {
        // WITH CUSTOM ANNOTATION WITH JUST A NAME
        // bind(ICarDAO.class).annotatedWith(Names.named("car_dao")).to(CarDAO.class);

        // WITH CUSTOM ANNOTATION
        bind(ICarDAO.class).annotatedWith(CarDAOAnn.class).to(CarDAO.class);
    }
}
