package oop_basics.sceneSwitch_2_0;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController extends RootController implements Initializable {

    @FXML
    private StackPane app_content;

    private final IControllerFactory controllerFactory;

    public DashBoardController(IControllerFactory controllerFactory) {
        this.controllerFactory = controllerFactory;
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("FROM DASHBAORD");
    }

    public void btnDashboard(ActionEvent actionEvent) {
    }

    public void btnUsersOnClick(ActionEvent actionEvent) {
    }

    // click on the button will load the new view into content
}
