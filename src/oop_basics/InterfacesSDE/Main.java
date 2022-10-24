package oop_basics.InterfacesSDE;

public class Main {
    public static void main(String[] args) {
        Random test = new Random();
        boolean to = test.test(6);

        if(to){
            System.out.println("ee");
        }
        else {
            System.out.println("nn");

        }
        AnotherOne anotherOne = new AnotherOne();
        var teste =  anotherOne.compareTo(3);
        System.out.println(teste);
    }
}
