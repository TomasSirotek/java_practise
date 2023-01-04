package abstract_base_controller_view;

import com.google.inject.Inject;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class BaseController extends RootController implements Initializable {

    @Inject
    IService service;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        service.getSystemOut();
    }
}
