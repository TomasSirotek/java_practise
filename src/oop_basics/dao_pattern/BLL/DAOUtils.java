package oop_basics.dao_pattern.BLL;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import oop_basics.dao_pattern.FXMLLoaderProvider;
import oop_basics.dao_pattern.GUI.Main;
import oop_basics.dao_pattern.GUI.ScreenController;
import oop_basics.dao_pattern.Paths;
import oop_basics.dao_pattern.ServiceModule;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Objects;

import static com.google.inject.Injector.*;
public class DAOUtils {

   //  private static final Injector injector = Guice.createInjector();

    // private static final Injector injector = Guice.createInjector(new ServiceModule());
    public static void loadFxmlPage(StackPane app_content,String path) {
//       // FXMLLoader fxmlLoader = FXMLLoaderProvider.get(FXMLLoader.class);
//          BEFORE FxmlLoader fxmlLoader = new FXMLLoader()
        //  HOWEVER we need the same loader that holds all injections
//        try {
//            fxmlLoader.load(Objects.requireNonNull(DAOUtils.class.getResource(path)).openStream());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        AnchorPane root = fxmlLoader.getRoot();
//        app_content.getChildren().clear();
//        app_content.getChildren().add(root);

    }


}
