package oop_basics.sceneSwitch_2_0;

import javafx.stage.Stage;

import java.io.IOException;

public interface ISceneManager {
    void switchScene(final FxmlView2 view) throws IOException;

    void setStage(Stage primaryStage);
}
