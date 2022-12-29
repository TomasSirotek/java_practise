package oop_basics.sceneSwitch_2_0;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

public interface View {

        Parent getView();

        void setView(Parent view) throws IllegalStateException;
}
