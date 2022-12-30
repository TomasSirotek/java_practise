package oop_basics.sceneSwitch_2_0;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import javafx.fxml.FXMLLoader;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
       bind(IControllerFactory.class).to(ControllerFactory.class).in(Singleton.class);
       bind(ISceneManager.class).to(SceneManager.class).in(Singleton.class);
       bind(ICarService.class).to(CarServiceTwo.class).in(Singleton.class);
    }
}
