package oop_basics.basicSwitchingJavaFx;

import javafx.scene.Parent;
import javafx.scene.Scene;

import java.util.Objects;

import static org.slf4j.LoggerFactory.getLogger;


public class StageManager {

    /**
     * Loads the object hierarchy from a FXML document and returns to root node
     * of that hierarchy.
     *
     * @return Parent root node of the FXML document hierarchy
     */
    private Parent loadViewNodeHierarchy(String fxmlFilePath) {

        Parent rootNode = null;
        try {
            rootNode = loader.load(fxmlFilePath);
            Objects.requireNonNull(rootNode, "A Root FXML node must not be null");
        } catch (Exception exception) {
           //  logAndExit("Unable to load FXML view" + fxmlFilePath, exception);
            Sys
        }
        return rootNode;
    }
}

