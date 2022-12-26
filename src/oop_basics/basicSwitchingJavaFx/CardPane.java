package oop_basics.basicSwitchingJavaFx;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

import java.util.HashMap;

public class CardPane extends StackPane {

    private HashMap<String, Node> screenMap;
  //  private Scene main;

    public CardPane() {
        //this.main = main;
        this.screenMap = new HashMap<>();
    }

    protected void addScreen(String name, Node pane){
        screenMap.put(name, pane);
    }

    protected void showCard(String name) {
        getChildren().clear();
        getChildren().add(screenMap.get(name));
    }

    protected void removeScreen(String name){
        screenMap.remove(name);
    }


}
