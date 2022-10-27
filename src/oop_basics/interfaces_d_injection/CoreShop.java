package oop_basics.interfaces_d_injection;

public class CoreShop {
    private final ICart cart;

    public CoreShop(ICart cart){
        this.cart = cart;

        cart.getItems();
    }

}
