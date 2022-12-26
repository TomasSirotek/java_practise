package oop_basics.basicSwitchingJavaFx;

public enum FXMLPaths {
    ROOT("fxmlFiles/rootView.fxml"),
    DASHBOARD_VIEW("../resources2/dashboardView.fxml"),
    ANOTHER_VIEW("../resources2/anotherView.fxml");

    private final String path;

    FXMLPaths(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}