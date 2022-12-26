package oop_basics.dao_pattern.GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import oop_basics.dao_pattern.BLL.DAOUtils;
import oop_basics.dao_pattern.FXMLLoaderProvider;
import oop_basics.dao_pattern.Paths;
import org.checkerframework.checker.units.qual.C;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Objects;
import java.util.ResourceBundle;


public class DashBoardController implements Initializable {

    public Label active_users;
    @FXML
    private StackPane app_content;
    @FXML
    private Label current_user_email;

    private final CurrentUser currentUser = CurrentUser.getInstance();

    private UserModel model;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       this.current_user_email.setText(currentUser.getEmail());
    }

    public void btnUsersOnClick(ActionEvent actionEvent) {;
        DAOUtils.loadFxmlPage(app_content, Paths.ANOTHER_VIEW.getPath());
       // AnotherViewController controller =  fxmlLoader.getController();
       // controller.setModel(ModelFactory.getModel("user"));
      //  controller.setModel(model);
    }

    public void btnDashboard(ActionEvent actionEvent) {
    }

    public void btnLogOutOnClick(ActionEvent actionEvent) {
    }

    public FXMLLoader loadFxmlPage(String path) {
        return null;
//        try {
//            fxmlLoader.load(Objects.requireNonNull(DAOUtils.class.getResource(path)).openStream());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//        AnchorPane root = fxmlLoader.getRoot();
//        app_content.getChildren().clear();
//        app_content.getChildren().add(root);
//
//        return fxmlLoader;
    }
}
