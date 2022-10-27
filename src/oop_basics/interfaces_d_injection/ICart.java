package oop_basics.interfaces_d_injection;

import java.util.ArrayList;

public interface ICart {
   ArrayList<Object> getItems();
   void putItemInCart(Object item);
   void removeObject(Object item);
}
