package oop_basics.sceneSwitch_2_0;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import oop_basics.dao_pattern.GUI.ScreenController;
import oop_basics.dao_pattern.Paths;
import oop_basics.dao_pattern.ServiceModule;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        Injector injector = Guice.createInjector(
                new AppModule()
        );
        FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);


        Parent root = fxmlLoader.load(
                Objects.requireNonNull(
                        oop_basics.sceneSwitch_2_0.Main.class.getResource(
                                FxmlView.LOGIN.getFxmlFile()
                        )));

        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("JavaFX Dependency injection");
        primaryStage.show();
        primaryStage.setOnCloseRequest(e -> {
            System.exit(0);
        });
    }
}
