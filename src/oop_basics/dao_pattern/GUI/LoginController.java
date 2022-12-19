package oop_basics.dao_pattern.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import oop_basics.dao_pattern.BLL.UserManager;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class LoginController implements Initializable {


    public TextField user_email;
    @FXML
    private Button log_in;
    @FXML
    private PasswordField user_password;

    private UserManager manager = new UserManager();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            log_in.setOnAction(this::login);
    }

    private void login(ActionEvent actionEvent)  {
        CurrentUser currentUser = CurrentUser.getInstance();
        currentUser.login(user_email.getText(),user_password.getText());
        try {
            if(currentUser.isAuthorized()){
                switchScenesToDashboard(actionEvent);
            }else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("invalid");
                alert.show();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    private void switchScenesToDashboard(ActionEvent actionEvent) {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources2/dashboardView.fxml"));
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
        ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }


}
