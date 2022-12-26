package oop_basics.basicSwitchingJavaFx;

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
    public void setStage(Stage primaryStage, FXMLLoader loader) {
        this.primaryStage = primaryStage;
        this.loader = loader;
    }

    @Override
    public AnchorPane switchTabsWithin(String path) {
        try {
            var test = this.loader.getRoot();
            this.loader.load(Objects.requireNonNull(StageManager.class.getResource(path)));
        } catch (Exception exception) {
            logAndExit("Unable to load FXML view" + path, exception);

        }
        return this.loader.getRoot();
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


//        //The FXMLLoader is instantiated the way Google Guice offers - the FXMLLoader instannce is built in a separated Provider<FXMLLoader> called FXMLLoaderProvider.
        FXMLLoader loader2 = this.loader;
        try {
            rootNode = loader2.load(Objects.requireNonNull(StageManager.class.getResource(fxmlFilePath)));
          //  Objects.requireNonNull(rootNode, "A Root FXML node must not be null");
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

