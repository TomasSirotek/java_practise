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

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class SceneManager implements ISceneManager {

    private Stage rootStage;
    @Inject
    private final Injector injector;
    @Inject
    public SceneManager(final Injector injector) {
        this.injector = injector;
    }
    public void switchScene(final FxmlView2 view) throws IOException {
        RootController viewRootNodeHierarchy = loadViewNodeHierarchy(view.getFxmlFile());
        show(viewRootNodeHierarchy.getView(), view.getFxmlFile());
    }

    @Override
    public void setStage(Stage primaryStage) {
        this.rootStage = primaryStage;
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


    private RootController loadViewNodeHierarchy(String fxmlFilePath) throws IOException {

        Objects.requireNonNull(fxmlFilePath, "fxmlFile must not be null.");

        final URL fxmlFileUrl = getClass().getResource(fxmlFilePath);
        //FXMLLoader loader2 =  injector.getInstance(FXMLLoader.class);
        // loader2 loads the fxmlFile

        final FXMLLoader loader = new FXMLLoader(fxmlFileUrl);
        loader.setControllerFactory(injector::getInstance);


        final Parent view = loader.load();
        final RootController controller = loader.getController();
        controller.setView(view);

        return controller;
//        Parent rootNode = null;
//
//        FXMLLoader loader2 = injector.getInstance(FXMLLoader.class);
//      //  FXMLLoader loader = new FXMLLoader();
//        try {
//            rootNode = loader2.load(Objects.requireNonNull(SceneManager.class.getResource(fxmlFilePath)));
//        } catch (Exception exception) {
//                throw new RuntimeException(exception);
//        }
//        return rootNode;
    }

}
