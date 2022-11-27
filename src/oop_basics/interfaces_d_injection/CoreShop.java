package oop_basics.interfaces_d_injection;

import java.util.ArrayList;

public class CoreShop {
    private final ICart cart;

    public CoreShop(ICart cart){
        this.cart = cart;
    }

    public ArrayList<Object> getAll(){
        return cart.getItems();
    }

}
