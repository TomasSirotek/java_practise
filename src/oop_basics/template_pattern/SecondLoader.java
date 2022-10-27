package oop_basics.template_pattern;

public class SecondLoader extends BaseLoader{
    @Override
    byte[] loadLocalData() {
        System.out.println("Loading data for SECONDARY .....");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("Creating objects for SECONDARY ....");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("Downloading files for SECONDARY ....");
    }

    @Override
    void initializeProfiles() {
        System.out.println("Loading profiles for SECONDARY ....");
    }
}
