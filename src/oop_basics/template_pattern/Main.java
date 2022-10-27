package oop_basics.template_pattern;

public class Main {
    public static void main(String[] args) {
        BaseLoader baseLoader;
        baseLoader = new FirstLoader();
        baseLoader.load();

        System.out.println("------END-----");

        baseLoader = new SecondLoader();
        baseLoader.load();

        System.out.println("-------END-------");

        baseLoader = new ThirdLoader();
        baseLoader.load();

        System.out.println("-------END-------");
    }
}
