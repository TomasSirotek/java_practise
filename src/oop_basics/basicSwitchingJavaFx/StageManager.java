package oop_basics.basicSwitchingJavaFx;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.slf4j.Logger;

import java.util.Objects;

import static org.slf4j.LoggerFactory.getLogger;

@Singleton
public class StageManager implements IStageManager{

    private static final Logger LOG = getLogger(StageManager.class);

    private static StageManager instance;

    private Stage primaryStage;

    private FXMLLoader loader;

    private final Injector injector = Guice.createInjector(
            new AppModule()
    );

    private StageManager() {
    }

    public static StageManager getInstance() {
        if (instance == null) {
            synchronized (StageManager.class) {
                if (instance == null) {
                    instance = new StageManager();
                }
            }
        }
        return instance;
    }

    public void switchScene(final FxmlView view) {
        Parent viewRootNodeHierarchy = loadViewNodeHierarchy(view.getFxmlFile());
        show(viewRootNodeHierarchy, view.getFxmlFile());
    }

    @Override
    public void setStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    @Override
    public void switchTabsWithin(String path) {
    // Load the view and get the root node
    Parent root = loadViewNodeHierarchy(path);

    //
        // needs to know about the Parent children for the deletation

    // Find the StackPane layout
        StackPane stackPane = (StackPane) primaryStage.getScene().lookup("#app_content");
    // Clear the StackPane and add the new root node
        stackPane.getChildren().clear();
        stackPane.getChildren().add(root);
}


    private void show(final Parent rootNode, String title) {
        Scene scene = prepareScene(rootNode);

        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();

        try {
            primaryStage.show();
        } catch (Exception exception) {
            logAndExit ("Unable to show scene for title" + title,  exception);
        }
    }

    private Scene prepareScene(Parent rootNode){
        Scene scene = primaryStage.getScene();

        if (scene == null) {
            scene = new Scene(rootNode);
        }
        scene.setRoot(rootNode);
        return scene;
    }

    /**
     * Loads the object hierarchy from a FXML document and returns to root node
     * of that hierarchy.
     *
     * @return Parent root node of the FXML document hierarchy
     */
    private Parent loadViewNodeHierarchy(String fxmlFilePath) {
        Parent rootNode = null;


        FXMLLoader loader2 = injector.getInstance(FXMLLoader.class);
        //FXMLLoader loader2 = new FXMLLoader();
        try {
            rootNode = loader2.load(Objects.requireNonNull(StageManager.class.getResource(fxmlFilePath)));
        } catch (Exception exception) {
            logAndExit("Unable to load FXML view" + fxmlFilePath, exception);
        }
        return rootNode;
    }

    private void logAndExit(String errorMsg, Exception exception) {
        LOG.error(errorMsg, exception, exception.getCause());
        Platform.exit();
    }
}

