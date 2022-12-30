package oop_basics.sceneSwitch_2_0;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;

public abstract class RootController implements View {

    private Parent root;

    @Override
    public Parent getView() {
        return root;
    }

    @Override
    public void setView(Parent view) throws IllegalStateException {

        if (this.root != null)
            throw new IllegalStateException("view already set.");

        this.root = Objects.requireNonNull(view, "view must not be null.");

    }

    protected Stage getStage() {
        return (Stage)root.getScene().getWindow();
    }






}
