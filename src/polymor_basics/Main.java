package polymor_basics;

import polymor_basics.model.Animal;
import polymor_basics.model.Cat;
import polymor_basics.model.Dog;

public class Main {
    public static void main(String[] args) {

         Animal a = new Animal();
         a.eat();


         Dog d = new Dog("Dick");
         d.eat();
        // System.out.println("Breed of the dog is " + d.getBreed());

         Cat c = new Cat();
         c.setIsHungry(true);
         c.eat();

         // Method overloading  same method with different params
         d.eat(2);

         System.out.println(c.getIsHungry());
    }
}
