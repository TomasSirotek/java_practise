package oop_basics.dao_pattern.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;

import static oop_basics.dao_pattern.DAL.DAOUtils.loadFxmlPage;

public class DashBoardController implements Initializable {

    public Label active_users;
    @FXML
    private StackPane app_content;
    @FXML
    private Label current_user_email;

    private final CurrentUser currentUser = CurrentUser.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       this.current_user_email.setText(currentUser.getEmail());
    }

    public void btnUsersOnClick(ActionEvent actionEvent) {
        FXMLLoader fxmlLoader = loadFxmlPage(app_content,"../resources2/anotherView.fxml");
    }

    public void btnDashboard(ActionEvent actionEvent) {
    }

    public void btnLogOutOnClick(ActionEvent actionEvent) {
    }
}
