package oop_basics.dao_pattern;

public enum Paths {
    LOGIN_VIEW("../resources2/loginView.fxml"),
    DASHBOARD_VIEW("../resources2/dashboardView.fxml"),
    ANOTHER_VIEW("../resources2/anotherView.fxml");

    private final String path;

    Paths(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
