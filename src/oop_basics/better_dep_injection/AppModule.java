package oop_basics.better_dep_injection;

import com.google.inject.AbstractModule;
import javafx.fxml.FXMLLoader;
import oop_basics.dao_pattern.FXMLLoaderProvider;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FXMLLoader.class).toProvider(FXMLLoaderProviderCustom.class);
    }
}
