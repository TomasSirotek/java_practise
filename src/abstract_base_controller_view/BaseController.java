package abstract_base_controller_view;

import com.google.inject.Inject;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class BaseController extends RootController implements Initializable {

    @FXML
    private StackPane app_content;
    @FXML
    private ScrollPane scroll_test;
    @Inject
    IService service;

    @Inject ISceneManager sceneManager;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        service.getSystemOut();

        List<String> list = new ArrayList<>();
        list.add("Action");
        list.add("Horror");

        list.add("Action");
        list.add("Horror");
        list.add("Action");
        list.add("Horror");
        list.add("Action");
        list.add("Horror");

        VBox vBox=new VBox();
        if(list.size() != 0){
            for (String title : list
            ) {
                var btn = new Button(title);
                btn.setOnAction(event -> {
                    try {
                        sceneManager.switchTabsWithin(app_content,"inside.fxml");
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });
                btn.setTranslateY(50);
                vBox.getChildren().add(btn);
            }
            scroll_test.setContent(vBox);
        }
        else {
            scroll_test.setContent(new Label("Empty"));
        }
    }
}
