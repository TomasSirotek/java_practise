package oop_basics.basicSwitchingJavaFx;

import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private Button loginButton;

    private final IStageManager stageManager1 = StageManager.getInstance();

//    public LoginController(IStageManager stageManager) {
//       // this.stageManager = stageManager;
//    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       // loginButton.setOnAction(this::loginButtonPressed);
       // stageManager.switchScene(FxmlView.MAIN);
    }

    public void usernameTextFieldMouseClicked(MouseEvent mouseEvent) {
    }

    public void passwordTextFieldMouseClicked(MouseEvent mouseEvent) {
    }

    public void loginButtonPressed(ActionEvent actionEvent) {
        System.out.println(stageManager1.toString());
        stageManager1.switchScene(FxmlView.MAIN);
        System.out.println("Hello word");
    }
}
