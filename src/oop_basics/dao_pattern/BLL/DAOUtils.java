package oop_basics.dao_pattern.DAL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class DAOUtils {

    public static FXMLLoader loadFxmlPage(StackPane app_content,String path) {
        FXMLLoader fxmlLoader = new FXMLLoader();
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
