package abstract_base_controller_view;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public interface ISceneManager {
    void showScene(String fxmlFile) throws IOException;
    void setStage(Stage stage);
    void switchTabsWithin(StackPane pane,String path) throws IOException;
}
