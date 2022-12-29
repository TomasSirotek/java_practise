package oop_basics.sceneSwitch_2_0;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.HashMap;

public class SceneController {

    private HashMap<String, AnchorPane> screenMap = new HashMap<>();
    private Scene main;

    public SceneController(Scene main) {
        this.main = main;
    }

    protected void addScreen(String name, AnchorPane pane){
        screenMap.put(name, pane);
    }

    protected void removeScreen(String name){
        screenMap.remove(name);
    }

    protected void activate(String name){
        main.setRoot(screenMap.get(name) );
    }
}
