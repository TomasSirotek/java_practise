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
import javafx.stage.Modality;
import javafx.stage.Stage;
import oop_basics.dao_pattern.BLL.DAOUtils;
import oop_basics.dao_pattern.BLL.IUserManager;
import oop_basics.dao_pattern.BLL.UserManager;

import javax.inject.Inject;
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

    // just test
    @Inject private IUserManager manager;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            log_in.setOnAction(this::login);
        try {
            System.out.println(manager.getAll().toString());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private void login(ActionEvent actionEvent)  {
        CurrentUser currentUser = CurrentUser.getInstance();
        currentUser.login(user_email.getText(),user_password.getText());
        String test ;
        try {
            // check if user is authorized
            // if authorized true send generated code to email address
            // display scene with input of code
            // if code matches with email code
            // switch to sceneToDashboard
            if(currentUser.isAuthorized()){
//                if(!currentUser.isActive()){
//                    // send random generated 4 digits to email service
//                    // display verification window
//                    if(displayVerificationWindow()){
//                        switchScenesToDashboard(actionEvent);
//                    }else {
//                        Alert alert = new Alert(Alert.AlertType.ERROR);
//                        alert.setContentText("invalid");
//                        alert.show();
//                    }
//                }
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

    private boolean displayVerificationWindow() {
        // display to check email address
        // compare if inputted code matches code that was sent to the email
        // if it matched then return true if not return false
        return false;
    }

    private void switchScenesToDashboard(ActionEvent actionEvent) {
        Parent root = null;
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources2/dashboardView.fxml"));
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Scene test = ((Node) actionEvent.getSource()).getScene();


        Stage stage = new Stage();
        //  stage.initOwner(getStage());
        stage.setResizable(false);
        stage.show();
        stage.setScene(new Scene(root));
       // ((Node) actionEvent.getSource()).getScene().getWindow().hide();
    }


}
