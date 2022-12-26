package oop_basics.basicSwitchingJavaFx.fxmlFiles;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class TestTab implements Initializable {
    @FXML
    private Label active_users;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        active_users.setText("Woeking");
    }
}
