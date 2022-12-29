package oop_basics.sceneSwitch_2_0;

import com.google.inject.AbstractModule;

public class ExampleModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new AppModule());
     //   install(new ModelModule());
    }
}
