package oop_basics.sceneSwitch_2_0;

import com.google.inject.AbstractModule;
import javafx.fxml.FXMLLoader;
import oop_basics.dao_pattern.FXMLLoaderProvider;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FXMLLoader.class).toProvider(FXMLLoaderProvider.class);
    }
}
