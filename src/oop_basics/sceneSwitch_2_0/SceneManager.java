package oop_basics.sceneSwitch_2_0;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import oop_basics.dao_pattern.ServiceModule;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SceneManager {

    private final Stage rootStage;

    public SceneManager(Stage rootStage) {
        if (rootStage == null) {
            throw new IllegalArgumentException();
        }
        this.rootStage = rootStage;
    }

    private final Map<String, Scene> scenes = new HashMap<>();

    public void switchScene(String url) {

        Scene scene = scenes.computeIfAbsent(url, u -> {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(u));
            try {
                AnchorPane p = loader.load();
//                BaseController controller = loader.getController();
//                controller.setSceneManager(this);
                return new Scene(p);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        rootStage.setScene(scene);
        rootStage.show();
    }

    protected void addScreen(String name, Scene pane){
        scenes.put(name, pane);
    }

}
