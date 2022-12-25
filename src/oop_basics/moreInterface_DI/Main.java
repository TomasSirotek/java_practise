package oop_basics.moreInterface_DI;

public class Main {
    public static void main(String[] args) {


        interface IShoppingCar{
            void getAll();
        }

        record Car(int id,String name) implements IShoppingCar{
            @Override
            public void getAll() {

            }
        }

    }
}
