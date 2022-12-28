package oop_basics.basicSwitchingJavaFx;


// Root Controller for the whole application

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Paint;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class RootController implements Initializable {


    // Should have login at the moment and after clicking button switch scene to BaseController(Fxml file with nav bar and changable content)

    @FXML
    private StackPane app_content;
    private final IStageManager stageManager1 = StageManager.getInstance();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stageManager1.switchTabsWithin(FxmlView.MAIN.getFxmlFile());
    }

    @FXML
    public void switchToUsers(ActionEvent actionEvent) {
       var test =  app_content.getChildren();
      // test.get(0).setVisible(false);
      //  app_content.setBackground(Background.fill(Paint.valueOf("red")));
      //  FXMLLoader fxmlLoader = new FXMLLoader();

        stageManager1.switchTabsWithin(FxmlView.ANOTHER.getFxmlFile());
      //  AnchorPane root = loader2.getRoot();
        //app_content.getChildren().clear();
        //app_content.getChildren().add(root);


        // load fxml file


        // clear all the children
        // load fxml file in there with own controllers



      //r®  stageManager1.switchScene(FxmlView.ANOTHER);
       // var test = pane.getChildren();
       // app_content.getChildren().clear();
       // app_content.getChildren().add(pane);
    }

    @FXML
    public void switchBackToDashBoard(ActionEvent actionEvent) {
      //  FXMLLoader fxmlLoader = stageManager1.getLoader();
//        try {
//            fxmlLoader.load(Objects.requireNonNull(getClass().getResource(FxmlView.MAIN.getFxmlFile())).openStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        AnchorPane root = fxmlLoader.getRoot();
//        app_content.getChildren().clear();
//        app_content.getChildren().add(root);
        stageManager1.switchTabsWithin(FxmlView.MAIN.getFxmlFile());

        System.out.println("Dashboard");
    }

    public void logout(ActionEvent actionEvent) {
        stageManager1.switchScene(FxmlView.LOGIN);
    }
}
