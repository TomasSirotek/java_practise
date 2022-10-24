package oop_basics.InterfacesSDE;

public class AnotherOne implements Comparable<Integer>{
    @Override
    public int compareTo(Integer o) {
        return o > 1 ? 200 : 300;
    }
}
