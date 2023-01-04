package abstract_base_controller_view;



import java.io.IOException;

public interface IControllerFactory {
    RootController loadController(final String fxmlFile) throws IOException;
}
