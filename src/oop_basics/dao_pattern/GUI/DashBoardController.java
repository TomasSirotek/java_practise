package oop_basics.dao_pattern.GUI;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController implements Initializable {


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CurrentUser currentUser = CurrentUser.getInstance();
        System.out.println(currentUser.getEmail());
    }
}
