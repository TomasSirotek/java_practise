package abstract_base_controller_view;

import com.google.inject.Inject;

public class Service implements IService{

    @Inject
    IDAO dao;

    @Inject
    public Service(IDAO dao ) {
        this.dao = dao;
    }

    @Override
    public void getSystemOut() {
       dao.getText();
    }
}
