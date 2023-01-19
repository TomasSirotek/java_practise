package abstract_base_controller_view;

import com.google.inject.Inject;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import oop_basics.sceneSwitch_2_0.FxmlView2;


import java.io.IOException;
import java.util.Objects;

public class SceneManager implements ISceneManager {
    private Stage stage;
    @Inject
    private IControllerFactory controllerFactory;

    @Inject
    public SceneManager(IControllerFactory controllerFactory) {
        // controllerFactory = StartUp.getInjector().getInstance(IControllerFactory.class);
        this.controllerFactory = controllerFactory;
    }

    public void setStage(final Stage stage){
        this.stage = stage;
    }

    public void switchTabsWithin(StackPane stage,String path) throws IOException {
        Parent root = loadViewNodeHierarchy(path);
        exchange(stage,root);
    }

    private Parent loadViewNodeHierarchy(String fxmlFile) throws IOException {
        Objects.requireNonNull(fxmlFile, "fxmlFile must not be null.");
        return controllerFactory.loadController(fxmlFile).getView();
    }

    private void exchange(StackPane pane,Parent root) {
       // StackPane stackPane = (StackPane) stage.getScene().lookup("#app_content");
        pane.getChildren().clear();
        pane.getChildren().add(root);
    }

    public void showScene(String fxmlFile) throws IOException {
         seperate class
        final RootController controller =
                controllerFactory.loadController("Base.fxml");

        Scene scene = new Scene(loadViewNodeHierarchy(fxmlFile));
        stage.setTitle("root");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.centerOnScreen();
        try {
            stage.show();
        } catch (Exception exception) {
            throw new RuntimeException("Unable to show scene for title", exception);
        }
    }
}
