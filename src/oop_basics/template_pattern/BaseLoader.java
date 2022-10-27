package oop_basics.template_pattern;

public abstract class BaseLoader {

    public void load(){
        byte[] data = loadLocalData();
        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFile();
        initalizeProfiles();
    }

    abstract byte[] loadLocalData();
    abstract void createObjects(byte[] data);
    abstract void downloadAdditionalFiles();
    abstract void initalizeProfiles();

    protected void cleanTempFile(){
        System.out.println("Cleaning temp files.....");
    }

}
