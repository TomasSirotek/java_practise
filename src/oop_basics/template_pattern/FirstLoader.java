package oop_basics.template_pattern;

public class FirstLoader extends BaseLoader{
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading data for PRIMARY .....");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating objects for PRIMARY ....");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading files for PRIMARY ....");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading profiles for PRIMARY ....");
    }
}
