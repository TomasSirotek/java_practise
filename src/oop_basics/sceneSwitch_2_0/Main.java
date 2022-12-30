package oop_basics.sceneSwitch_2_0;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop_basics.basicSwitchingJavaFx.AppModule;

import java.io.IOException;

public class Main extends Application {

    private final IControllerFactory controllerFactory;

    public Main() {
        final Injector injector = Guice.createInjector(new ExampleModule());
        controllerFactory = injector.getInstance(IControllerFactory.class);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        final RootController controller = controllerFactory.loadController(
                FxmlView2.LOGIN.getFxmlFile()
        );

        primaryStage.setTitle("JavaFX Guice Example");
        primaryStage.setScene(new Scene(controller.getView()));
        primaryStage.show();

//        Injector injector = Guice.createInjector(
//                new AppModule()
//        );
//        FXMLLoader fxmlLoader = injector.getInstance(FXMLLoader.class);
//
//
//        Parent root = fxmlLoader.load(
//                Objects.requireNonNull(
//                        oop_basics.sceneSwitch_2_0.Main.class.getResource(
//                                FxmlView2.LOGIN.getFxmlFile()
//                        )));
//
//        primaryStage.setScene(new Scene(root));
//        primaryStage.setTitle("JavaFX Dependency injection");
//        primaryStage.show();
//        primaryStage.setOnCloseRequest(e -> {
//            System.exit(0);
//        });
    }
    public static void main(String[] args) {
        launch(args);
    }

}
