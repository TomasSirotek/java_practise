package oop_basics.sceneSwitch_2_0;

import java.io.IOException;

public interface IControllerFactory {
    RootController loadController(final FxmlView2 fxmlFile) throws IOException;
}
