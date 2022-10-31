package oop_basics.interfaces_d_injection;

public class Main {
    public static void main(String[] args) {

        ICart cart = new Cart();
        CoreShop coreShop = new CoreShop(cart);
        CoreShop coreShop2 = new CoreShop(cart);
    }
}
