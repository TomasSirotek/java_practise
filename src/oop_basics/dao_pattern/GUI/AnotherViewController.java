package oop_basics.dao_pattern.GUI;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import oop_basics.dao_pattern.User;

import javax.inject.Inject;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class AnotherViewController implements Initializable {
    @FXML
    private Label active_users;

    //private final CurrentUser currentUser = CurrentUser.getInstance();

    @Inject
    private IModel userModel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
       // active_users.setText(currentUser.getEmail() + " " + currentUser.isLoggedIn());
        try {
            active_users.setText(userModel.getAll().get(0).getEmail());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        if(userModel != null){ // but it is null for now
            try {
                setTableView();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void setModel(IModel userModel){
        this.userModel = userModel;
    }

    private void setTableView() throws SQLException {
        var test = userModel.getAll();
        test.forEach(System.out::println);
    }
}
