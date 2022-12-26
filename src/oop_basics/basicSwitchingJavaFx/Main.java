package oop_basics.basicSwitchingJavaFx;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import oop_basics.dao_pattern.Paths;
import oop_basics.dao_pattern.ServiceModule;

import java.util.Objects;

public final class Main extends Application {

    Stage window;
    Scene scene1, scene2;

    protected StageManager stageManager;

    @Override
    public void start(Stage primaryStage) throws Exception {

//        Injector injector = Guice.createInjector(
//                new AppModule()
//        );
//        //The FXMLLoader is instantiated the way Google Guice offers - the FXMLLoader instannce is built in a separated Provider<FXMLLoader> called FXMLLoaderProvider.
//        FXMLLoader loader = injector.getInstance(FXMLLoader.class);
//
//        AnchorPane root = loader.load(
//                Objects.requireNonNull(
//                        oop_basics.basicSwitchingJavaFx.Main.class.getResource(
//                                FXMLPaths.ROOT.getPath())).openStream()
//        );
//
//        stage.setScene(new Scene(root));
//        stage.setTitle("Card pain");
//        stage.show();
//        stage.setOnCloseRequest(e -> {
//            System.exit(0);
//        });


    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Useful to override this method by sub-classes wishing to change the first
     * Scene to be displayed on startup. Example: Functional tests on main
     * window.
     */
    protected void displayInitialScene() {
        stageManager.switchScene(FXMLPaths.ROOT.getPath());
    }

}