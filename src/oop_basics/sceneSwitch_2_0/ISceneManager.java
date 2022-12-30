package oop_basics.sceneSwitch_2_0;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public interface ISceneManager {
    void switchScene(final FxmlView2 view) throws IOException;

    void openNewAdditionalStage(FxmlView2 path, String title) throws IOException;

    void setStage(Stage primaryStage);
    void switchTabsWithin(FxmlView2 path) throws IOException;
}
