package oop_basics.sceneSwitch_2_0;

import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


// logic cntrl
public class BaseController extends RootController implements Initializable {

    private final IControllerFactory controllerFactory;

    @Inject
    public BaseController(IControllerFactory controllerFactory) {
        this.controllerFactory = controllerFactory;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void loginButtonPressed(ActionEvent actionEvent) throws IOException {

        final RootController resultController = controllerFactory.loadController(FxmlView2.MAIN.getFxmlFile());

        Stage stage = new Stage();
        stage.initOwner(getStage());
        stage.setScene(new Scene(resultController.getView()));
        stage.setResizable(false);
        stage.show();
     //   ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }
}
