package oop_basics.sceneSwitch_2_0;

import java.io.IOException;

public interface IControllerFactory {
    RootController loadController(final String fxmlFile) throws IOException;
}
