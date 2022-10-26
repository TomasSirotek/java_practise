package oop_basics.assign5;

import java.util.*;

import java.util.List;

public class Teacher extends Person{

    private List<String> subjects = new ArrayList<>();;
    private String initials;
    private Double salary;

    public Teacher(int id, String name,String initials) {
        super(id, name);
        this.initials = initials;
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    public String getInitials() {
        return this.initials;
//        StringBuilder initials = new StringBuilder();
//        boolean addNext = true;
//        if (getName() != null) {
//            for (int i = 0; i < getName().length(); i++) {
//                char c = getName().charAt(i);
//                if (c == ' ' || c == '-' || c == '.') {
//                    addNext = true;
//                } else if (addNext) {
//                    initials.append(c);
//                    addNext = false;
//                }
//            }
//        }
//        return initials.toString();
    }

    public void addSubject(String subject){
        this.subjects.add(subject);
    }

    public Double getSalary() {
        return this.salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return getId() + " " + getName() + " " + getEmail() + " " + getInitials() + " " + getSubjects();
    }
}
