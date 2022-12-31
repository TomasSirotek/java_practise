package oop_basics.sceneSwitch_2_0;

import com.google.inject.Inject;
import com.google.inject.Injector;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

//  Singleton Controller Factory
//        Guice comes with a built-in @Singleton scope that reuses the same instance during the lifetime
//        of an application within a single injector. Both javax.inject.Singleton and com.google.inject.
//        Singleton are supported by Guice, but prefer the standard javax.inject.Singleton since it is also
//        supported by other injection frameworks like Dagger.

public class ControllerFactory implements IControllerFactory {

    @Inject
    private final Injector injector;

    @Inject
    public ControllerFactory(final Injector injector) {
        this.injector = Objects.requireNonNull(injector, "injector must not be null.");
    }

    @Override
    public RootController loadController(final String fxmlFile) throws IOException {

        Objects.requireNonNull(fxmlFile, "fxmlFile must not be null.");

        final URL fxmlFileUrl = getClass().getResource(fxmlFile);
        //FXMLLoader loader2 =  injector.getInstance(FXMLLoader.class);
        // loader2 loads the fxmlFile

        final FXMLLoader loader = new FXMLLoader(fxmlFileUrl);
        loader.setControllerFactory(injector::getInstance);

        final Parent view = loader.load();
        final RootController controller = loader.getController();
        controller.setView(view);

        return controller;

    }
}
