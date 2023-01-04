package abstract_base_controller_view;

import javafx.scene.Parent;

import java.util.Objects;

public abstract class RootController {
    private Parent root;

    public Parent getView() {
        return root;
    }

    public void setView(Parent view) throws IllegalStateException {
        if (this.root != null)
            throw new IllegalStateException("view already set.");

        this.root = Objects.requireNonNull(view, "view must not be null.");

    }
}
