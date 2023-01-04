package abstract_base_controller_view;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import oop_basics.sceneSwitch_2_0.ExampleModule;
import oop_basics.sceneSwitch_2_0.ISceneManager;

import java.util.Objects;

public class StartUp {
    private static Injector injector;

    public static void configure(){
        injector = Guice.createInjector(
                new ApplicationModule()
        );
        //injector.getInstance(IControllerFactory.class);
    }

    public static Injector getInjector() {
        return injector;
    }
}
