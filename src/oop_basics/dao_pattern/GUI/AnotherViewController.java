package oop_basics.dao_pattern.GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class AnotherViewController implements Initializable {
    @FXML
    private Label active_users;

    private final CurrentUser currentUser = CurrentUser.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        active_users.setText(currentUser.getEmail() + " " + currentUser.isLoggedIn());
    }
}
