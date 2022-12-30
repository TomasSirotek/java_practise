package oop_basics.better_dep_injection;

import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Provider;
import javafx.fxml.FXMLLoader;
public class FXMLLoaderProviderCustom implements Provider<FXMLLoader> {
    @Inject
    Injector injector;
    @Override
    public FXMLLoader get() {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(injector::getInstance);
        return loader;
    }
}
