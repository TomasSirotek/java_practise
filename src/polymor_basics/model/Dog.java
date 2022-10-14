package polymor_basics.model;


public class Dog extends Animal {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    // overriding eat method from super class
    public void eat(){
        System.out.println("Eating from dog");
    }

    // method overloading
    public void eat(int numberOfMsg){
        for (int i = 0; i < numberOfMsg; i++) {
            System.out.println("Eating from dog multiple times same method name");
        }
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
}
