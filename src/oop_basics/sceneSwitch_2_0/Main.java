package oop_basics.sceneSwitch_2_0;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop_basics.basicSwitchingJavaFx.AppModule;

import java.io.IOException;

public class Main extends Application {

    private final IControllerFactory controllerFactory;

    //private final ISceneManager sceneManager;

    public Main() {
        final Injector injector = Guice.createInjector(
                new ExampleModule()
        );
       controllerFactory = injector.getInstance(IControllerFactory.class);
       // sceneManager = injector.getInstance(ISceneManager.class);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //sceneManager.setStage(primaryStage);
      // sceneManager.switchScene(FxmlView2.LOGIN);

        final RootController controller =
                controllerFactory.loadController(FxmlView2.LOGIN);


//       && Scene scene2 = primaryStage.getScene();
//
//        if (scene2 == null) {
//            scene2 = new Scene(controller.getView());
//        }
//        scene2.setRoot(controller.getView());

        Scene scene2 = new Scene(controller.getView());

        primaryStage.setTitle("root");
        primaryStage.setScene(scene2);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();

        try {
            primaryStage.show();
        } catch (Exception exception) {
            throw new RuntimeException (
                    "Unable to show scene for title" ,
                    exception
            );
        }
//
//        primaryStage.setTitle("JavaFX Guice Example");
//        primaryStage.setScene(new Scene(controller.getView())); // here I can just grab the controller view to the new scene
//
//        primaryStage.show();

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
