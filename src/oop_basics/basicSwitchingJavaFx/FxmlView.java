package oop_basics.basicSwitchingJavaFx;

public enum FxmlView {
    MAIN {
        @Override
         String getFxmlFile() {
            return "fxmlFiles/rootView.fxml";
        }
    },
    LOGIN {
        @Override
         String getFxmlFile() {
            return "fxmlFiles/loginView.fxml";
        }
    },
    USERS_TAB {
        @Override
         String getFxmlFile() {
            return "fxmlFiles/userTab.fxml";
        }
    },
    DASHBOARD_TAB{
        @Override
         String getFxmlFile() {
            return "fxmlFiles/dashBoardView.fxml";
        }
    }

    ;
     abstract String getFxmlFile();

}
