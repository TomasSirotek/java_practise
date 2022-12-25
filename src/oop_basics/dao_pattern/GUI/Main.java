package oop_basics.dao_pattern.GUI;

import com.google.inject.Guice;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop_basics.better_dep_injection.CarService;
import oop_basics.better_dep_injection.MyModule;
import oop_basics.dao_pattern.ServiceModule;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author pgn
 */
public final class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Injector injector = Guice.createInjector(new ServiceModule());
        //The FXMLLoader is instantiated the way Google Guice offers - the FXMLLoader instannce is built in a separated Provider<FXMLLoader> called FXMLLoaderProvider.
        FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);


        try (InputStream fxmlInputStream = ClassLoader.getSystemResourceAsStream("../resources2/loginView.fxml")) {
            Parent parent = fxmlLoader.load(fxmlInputStream);
            stage.setScene(new Scene(parent));
            stage.setTitle("JavaFX 8 Dependency injection");
            stage.show();
            stage.setOnCloseRequest(e -> {
                System.exit(0);
            });
        } catch (IOException ex) {
            ex.printStackTrace();
        }

//        Parent root = FXMLLoader.load(getClass().getResource("../resources2/loginView.fxml"));
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.setResizable(false);
//        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}