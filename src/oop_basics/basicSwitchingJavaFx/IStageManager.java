package oop_basics.basicSwitchingJavaFx;

import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public interface IStageManager {
    void switchScene(final FxmlView view);

    void setStage(Stage primaryStage, FXMLLoader injector);

    void switchTabsWithin(FxmlView another, StackPane appContent);
}
