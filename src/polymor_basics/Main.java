package polymor_basics;

import polymor_basics.model.Animal;
import polymor_basics.model.Cat;
import polymor_basics.model.Dog;

public class Main {
    public static void main(String[] args) {
         // POLYMORPHISM - METHOD OVERLOADING WHEN SAME METHOD
         // NAME DOES DIFFERENT THING AND HAVE DIFFERENT PARAMS

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

         String[][] field = new String[2][2];

         for (int r = 0; r < field.length; r++) {
              for (int col = 0; col < field.length; col++) {
                    field[r][col] = " Empty " + " ";
              }
         }

         for (int i = 0; i < field.length; i++) {
              for (int j = 0; j < field.length; j++) {
                   System.out.print(field[i][j]);
              }
              System.out.println();
         }

         String[][][] _field3d = new String[3][3][3];
         int currentState = 0;
         String textOutPut = " X " + " ";
         String textOutPut2 = " 0 " + " ";


         for (int r = 0; r < _field3d.length; r++) {
              for (int col = 0; col < _field3d.length; col++) {
                   for (int in = 0; in < _field3d.length; in++) {
                       _field3d[r][col][in] = currentState == 0 ? textOutPut : textOutPut2;
                       if(currentState == 0){
                            currentState = 1;
                       } else
                            currentState = 0;
                   }
              }
         }

         for (int i = 0; i < _field3d.length; i++) {
              for (int j = 0; j < _field3d.length; j++) {
                   for (int k = 0; k < _field3d.length; k++) {
                        System.out.print(_field3d[i][j][k]);
                   }
                   System.out.println();
              }
         }



    }

    private static int setState(int currentState){
         if(currentState == 0)
              currentState = 1;
         else
              currentState = 0;

         return currentState;
    }
}
