package abstract_base_controller_view;

import com.google.inject.Inject;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import oop_basics.basicSwitchingJavaFx.IStageManager;
import oop_basics.basicSwitchingJavaFx.StageManager;


public class Main extends Application {
    @Inject
    static
    ISceneManager sceneManager;
    public static void main(String[] args) {
        StartUp.configure();
        sceneManager = StartUp.getInjector().getInstance(SceneManager.class);
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        sceneManager.setStage(primaryStage);
        sceneManager.showScene("Base.fxml");
//        IControllerFactory controllerFactory2 =
//                StartUp.getInjector().getInstance(IControllerFactory.class);
//
//        // seperate class
//        final RootController controller =
//                controllerFactory2.loadController("Base.fxml");
//
//        Scene scene = new Scene(controller.getView());
//
//        primaryStage.setTitle("root");
//        primaryStage.setScene(scene);
//        primaryStage.sizeToScene();
//        primaryStage.centerOnScreen();
//
//        try {
//            primaryStage.show();
//        } catch (Exception exception) {
//            throw new RuntimeException (
//                    "Unable to show scene for title" ,
//                    exception
//            );
//        }
    }
}
