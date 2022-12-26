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
    ANOTHER {
        @Override
        String getFxmlFile() {
            return "fxmlFiles/testTab.fxml";
        }
    };
    abstract String getFxmlFile();

}
