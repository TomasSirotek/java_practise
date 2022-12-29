package oop_basics.sceneSwitch_2_0;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import oop_basics.sceneSwitch_2_0.AppModule;

import oop_basics.dao_pattern.ServiceModule;

import java.util.Objects;

public class SceneManager implements ISceneManager {

    private final Stage rootStage;

    private final Injector injector;

    public SceneManager(Stage rootStage) {
        if (rootStage == null) {
            throw new IllegalArgumentException();
        }
        this.rootStage = rootStage;
        this.injector = Guice.createInjector(
                new AppModule()
        );
    }

    public void switchScene(final FxmlView2 view) {
        Parent viewRootNodeHierarchy = loadViewNodeHierarchy(view.getFxmlFile());
        show(viewRootNodeHierarchy, view.getFxmlFile());
    }

    private void show(final Parent rootNode, String title) {
        Scene scene = prepareScene(rootNode);

        rootStage.setTitle(title);
        rootStage.setScene(scene);
        rootStage.sizeToScene();
        rootStage.centerOnScreen();

        try {
            rootStage.show();
        } catch (Exception exception) {
            throw new RuntimeException (
                    "Unable to show scene for title" + title,
                    exception
            );
        }
    }

    private Scene prepareScene(Parent rootNode){
        Scene scene = rootStage.getScene();

        if (scene == null) {
            scene = new Scene(rootNode);
        }
        scene.setRoot(rootNode);
        return scene;
    }


    private Parent loadViewNodeHierarchy(String fxmlFilePath) {
        Parent rootNode = null;

        FXMLLoader loader2 = injector.getInstance(FXMLLoader.class);
      //  FXMLLoader loader = new FXMLLoader();
        try {
            rootNode = loader2.load(Objects.requireNonNull(SceneManager.class.getResource(fxmlFilePath)));
        } catch (Exception exception) {
                throw new RuntimeException(exception);
        }
        return rootNode;
    }

}
