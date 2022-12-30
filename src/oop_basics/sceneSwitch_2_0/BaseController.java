package oop_basics.sceneSwitch_2_0;

import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


// logic cntrl
public class BaseController extends RootController implements Initializable {

    @Inject
   private final ISceneManager sceneManager;

  //  @Inject
//    public BaseController(IControllerFactory controllerFactory) {
//      //  this.controllerFactory = controllerFactory;
//    }
//    @Inject
//    private final ISceneManager sceneManager;

    @Inject
    public BaseController(ISceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("FROM BASE");
    }

    public void loginButtonPressed(ActionEvent actionEvent) throws IOException {
            // IF ALL GOES ALRIGHT SWITCH SCENE
            sceneManager.switchScene(FxmlView2.MAIN);

//        final RootController controller =
//                controllerFactory.loadController(FxmlView2);


//       Scene scene2 = primaryStage.getScene();
//
//        if (scene2 == null) {
//            scene2 = new Scene(controller.getView());
//        }
//        scene2.setRoot(controller.getView());

     //   Scene scene2 = prepareScene(controller.getView());

      //  Stage window = new Stage();
//          var test= ((Stage) actionEvent.getSource()).getScene().getWindow();
//       // test.setTitle("test");
//      //  getStage().setScene(scene2);
//        test.sizeToScene();
//        test.centerOnScreen();
      //<  test.show();

     //   // this one load the parent view that will be displayed
      // final RootController resultController = controllerFactory.loadController(FxmlView2.MAIN.getFxmlFile());
//
//        // main parent that needs to be set as new root
//
//        Scene scene = prepareScene(resultController.getView());
       //  sceneManager.switchScene(FxmlView2.MAIN);
//        Stage window = new Stage();
//
//        window.setTitle("test");
//      //  window.setScene(new Scene(resultController.getView()));
//        window.sizeToScene();
//        window.centerOnScreen();
//        window.show();
//
//        getStage().close();

//
//        try {
//            window.show();
//        } catch (Exception exception) {
//
//        }



//        Stage stage = getStage();
//       // stage.initOwner(getStage());
//        stage.setScene(new Scene(resultController.getView()));
//        stage.setResizable(false);
//        stage.show();
//     //   ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }
}
