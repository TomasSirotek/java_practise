package oop_basics.abstract_factory_pattern;

public class RomanianChair implements Chair{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return false;
    }
}
