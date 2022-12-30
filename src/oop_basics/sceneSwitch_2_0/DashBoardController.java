package oop_basics.sceneSwitch_2_0;

import com.google.inject.Inject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import oop_basics.basicSwitchingJavaFx.FxmlView;
import oop_basics.basicSwitchingJavaFx.IStageManager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardController extends RootController implements Initializable {
    @Inject ICarService carServiceTwo;
    @Inject ISceneManager stageManager;

   // private final IControllerFactory controllerFactory;
    @Inject
    public DashBoardController(ICarService carServiceTwo,ISceneManager stageManager) {
        this.carServiceTwo = carServiceTwo;
        this.stageManager = stageManager;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            stageManager.switchScene(FxmlView2.DASHBOARD_TAB);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void btnDashboard(ActionEvent actionEvent) throws IOException {
        stageManager.switchScene(FxmlView2.MAIN);
    }

    public void btnUsersOnClick(ActionEvent actionEvent) throws IOException {
        stageManager.switchTabsWithin(FxmlView2.USERS_TAB);
    }

    // click on the button will load the new view into content
}
