package oop_basics.sceneSwitch_2_0;

public enum FxmlView2 {
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
            return "userTab.fxml";
        }
    }, DASHBOARD_TAB{
        @Override
        String getFxmlFile() {
            return "dashboardTab.fxml";
        }
    };
    abstract String getFxmlFile();

}
