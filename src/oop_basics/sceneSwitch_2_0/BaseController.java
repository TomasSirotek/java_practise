package oop_basics.sceneSwitch_2_0;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;


// logic cntrl
public class BaseController implements Initializable {

    SceneManager sceneManager;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setSceneManager(SceneManager sceneManager) {
        this.sceneManager = sceneManager;
    }

    public void loginButtonPressed(ActionEvent actionEvent) {
       sceneManager.switchScene(FxmlView.MAIN.getFxmlFile());
    }
}
