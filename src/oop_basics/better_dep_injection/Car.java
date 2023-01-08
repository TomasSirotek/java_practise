package oop_basics.better_dep_injection;

public record Car(String name,int id) {
    @Override
    public String toString() {
        return "This car has name: " + name;
    }
}
