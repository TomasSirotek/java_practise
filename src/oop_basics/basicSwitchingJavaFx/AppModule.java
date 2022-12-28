package oop_basics.basicSwitchingJavaFx;

import com.google.inject.AbstractModule;
import javafx.fxml.FXMLLoader;

import oop_basics.dao_pattern.BLL.IUserManager;
import oop_basics.dao_pattern.BLL.UserManager;
import oop_basics.dao_pattern.FXMLLoaderProvider;
import oop_basics.dao_pattern.GUI.CurrentUser;


public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(FXMLLoader.class).toProvider(FXMLProvider.class);
       // bind(IStageManager.class).toInstance(StageManager.getInstance());
       //  bind(StageManager.class).toInstance(StageManager.);
    }
}