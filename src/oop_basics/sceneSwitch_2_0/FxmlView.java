package oop_basics.sceneSwitch_2_0;

public enum FxmlView {
    MAIN {
        @Override
        String getFxmlFile() {
            return "dashBoardView.fxml";
        }
    },
    LOGIN {
        @Override
        String getFxmlFile() {
            return "loginView.fxml";
        }
    },
    USERS_TAB {
        @Override
        String getFxmlFile() {
            return "fxmlFiles/testTab.fxml";
        }
    };
    abstract String getFxmlFile();

}
