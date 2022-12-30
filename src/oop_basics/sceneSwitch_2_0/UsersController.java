package oop_basics.sceneSwitch_2_0;

import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UsersController extends RootController implements Initializable {
    @FXML
    private Label active_users;

    @Inject private final ISceneManager sceneManager;

    @Inject private final ICarService carServiceTwo;

    @Inject
    public UsersController(ISceneManager sceneManager, ICarService carServiceTwo) {
        this.sceneManager = sceneManager;
        this.carServiceTwo = carServiceTwo;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("controller hello signal");
    }

    @FXML
    public void openNewWindow(ActionEvent actionEvent) throws IOException {
        sceneManager.openNewAdditionalStage(FxmlView2.LOGIN,carServiceTwo.getName());

    }
}
