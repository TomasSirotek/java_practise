package oop_basics.binary_search;

public class Comparator implements java.util.Comparator<User> {
    @Override
    public int compare(User s1, User s2) {
        if (s1.getId()== s2.getId()) {
            return 0;
        }
        else if (s1.getId() > s2.getId()) {
            return 1;
        }
        else if (s1.getId() < s2.getId()) {
            return -1;
        }
        return -1;
    }
}
