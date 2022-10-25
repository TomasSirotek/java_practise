package oop_basics.InterfacesSDE;

import java.util.function.Predicate;

public class Random implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 3;
    }
}
