package abstract_base_controller_view;

import javafx.stage.Stage;

import java.io.IOException;

public interface ISceneManager {
    void showScene(String fxmlFile) throws IOException;
    void setStage(Stage stage);
}
