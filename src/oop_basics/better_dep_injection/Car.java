package oop_basics.better_dep_injection;

public record Car(String name) {
    @Override
    public String toString() {
        return "This car has name: " + name;
    }
}
