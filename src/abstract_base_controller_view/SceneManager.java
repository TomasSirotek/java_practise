package abstract_base_controller_view;

import com.google.inject.Inject;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class SceneManager implements ISceneManager {
    private Stage stage;
    @Inject
    private IControllerFactory controllerFactory;

    @Inject
    public SceneManager(IControllerFactory controllerFactory) {
        // controllerFactory = StartUp.getInjector().getInstance(IControllerFactory.class);
        this.controllerFactory = controllerFactory;
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    public void showScene(String fxmlFile) throws IOException {
        // seperate class
        final RootController controller =
                controllerFactory.loadController("Base.fxml");

        Scene scene = new Scene(controller.getView());
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
