package oop_basics.sceneSwitch_2_0;

import com.google.inject.Inject;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneManager implements ISceneManager {

    private Stage rootStage;
    @Inject
    private final IControllerFactory controllerFactory;
    @Inject
    public SceneManager(IControllerFactory controllerFactory) {
        this.controllerFactory = controllerFactory;
    }
    public void switchScene(final FxmlView2 view) throws IOException {
        Parent viewRootNodeHierarchy = loadViewNodeHierarchy(view.getFxmlFile());
        show(viewRootNodeHierarchy, view.getFxmlFile());
    }

    @Override
    public void switchTabsWithin(FxmlView2 path) throws IOException {
        Parent root = loadViewNodeHierarchy(path.getFxmlFile());
        exchange(root);
    }

    private void exchange(Parent root) {
        StackPane stackPane = (StackPane) rootStage.getScene().lookup("#app_content");
        stackPane.getChildren().clear();
        stackPane.getChildren().add(root);
    }
    @Override
    public void openNewAdditionalStage(FxmlView2 path, String title) throws IOException {
        Parent root = loadViewNodeHierarchy(path.getFxmlFile());
        Stage stage = new Stage();
        stage.setTitle(title);
        stage.setScene(new Scene(root));
        stage.sizeToScene();
        stage.centerOnScreen();
        stage.show();
    }

    @Override
    public void setStage(final Stage primaryStage) {
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

    private Parent loadViewNodeHierarchy(String fxmlFilePath) throws IOException {
        Objects.requireNonNull(fxmlFilePath, "fxmlFile must not be null.");
        RootController controller = controllerFactory.loadController(fxmlFilePath);
        return controller.getView();
    }

    //        final URL fxmlFileUrl = getClass().getResource(fxmlFilePath);
//        //FXMLLoader loader2 =  injector.getInstance(FXMLLoader.class);
//        // loader2 loads the fxmlFile
//
//        final FXMLLoader loader = new FXMLLoader(fxmlFileUrl);
//        loader.setControllerFactory(injector::getInstance);
//
//
//        final Parent view = loader.load();
//        final RootController controller = loader.getController();
//        controller.setView(view);
//
//        return controller;
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
