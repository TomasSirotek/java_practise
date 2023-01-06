package abstract_base_controller_view;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public class ApplicationModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ISceneManager.class).to(SceneManager.class).in(Singleton.class);
        bind(IControllerFactory.class).to(ControllerFactory.class).in(Singleton.class);
        bind(IService.class).to(Service.class).in(Singleton.class);
        bind(IDAO.class).to(DAO.class);
    }
}
