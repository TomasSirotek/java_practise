package oop_basics.dao_pattern.BLL;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import oop_basics.Main;
import oop_basics.dao_pattern.ServiceModule;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Objects;

import static com.google.inject.Injector.*;
public class DAOUtils {

   //  private static final Injector injector = Guice.createInjector();

    private static final Injector injector = Guice.createInjector(new ServiceModule());
    private static FXMLLoader fxmlLoader;

    public static FXMLLoader loadFxmlPage(StackPane app_content,String path) {
       // FXMLLoader fxmlLoader = new FXMLLoader();
//
//        Injector injector = Guice.createInjector(new ServiceModule());
//        //The FXMLLoader is instantiated the way Google Guice offers - the FXMLLoader instannce is built in a separated Provider<FXMLLoader> called FXMLLoaderProvider.
//        FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);
//        fxmlLoader.setLocation(Main.class.getResource(path));

//        try {
//            fxmlLoader.load(DAOUtils.class.getResource(path).openStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        fxmlLoader.setControllerFactory(injector::getInstance);
        // fxmlLoader.setLocation(DAOUtils.class.getResource(path));

        //The FXMLLoader is instantiated the way Google Guice offers - the FXMLLoader instannce is built in a separated Provider<FXMLLoader> called FXMLLoaderProvider.
        FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);

        try {
            fxmlLoader.load(DAOUtils.class.getResource(path).openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        AnchorPane root = fxmlLoader.getRoot();
        app_content.getChildren().clear();
        app_content.getChildren().add(root);

        return fxmlLoader;
    }


}
