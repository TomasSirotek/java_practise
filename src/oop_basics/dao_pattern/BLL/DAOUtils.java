package oop_basics.dao_pattern.BLL;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.lang.reflect.Constructor;

import static com.google.inject.Injector.*;
public class DAOUtils {

    private static final Injector injector = Guice.createInjector();

    public static FXMLLoader loadFxmlPage(StackPane app_content,String path) {
        FXMLLoader fxmlLoader = new FXMLLoader();
        try {
            fxmlLoader.load(DAOUtils.class.getResource(path).openStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        fxmlLoader.setControllerFactory(injector::getInstance);

        AnchorPane root = fxmlLoader.getRoot();
        app_content.getChildren().clear();
        app_content.getChildren().add(root);

        return fxmlLoader;
    }
}
