package oop_basics.assign5;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{

    private List<String> subjects;
    private String initials;
    private Double salary;

    public Teacher(int id, String name, String email) {
        super(id, name, email);
        this.subjects = new ArrayList<>();
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    public String getInitials() {
        StringBuilder initials = new StringBuilder();
        boolean addNext = true;
        if (getName() != null) {
            for (int i = 0; i < getName().length(); i++) {
                char c = getName().charAt(i);
                if (c == ' ' || c == '-' || c == '.') {
                    addNext = true;
                } else if (addNext) {
                    initials.append(c);
                    addNext = false;
                }
            }
        }
        return initials.toString();
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void addSubject(String subject){
        this.subjects.add(subject);
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return getId() + " " + getName() + " " + getEmail() + " " + getInitials() + " " + getSubjects();
    }
}
