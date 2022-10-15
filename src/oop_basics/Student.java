package oop_basics;

public class Student {
    private String name;
    private String dOb;
    private boolean hasStudentHousing;

    private Course course;

    public Student(String name,String dOb, boolean hasStudentHousing){
        this.name = name;
        this.dOb = dOb;
        this.hasStudentHousing = hasStudentHousing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOb() {
        return dOb;
    }

    public void setDOb(String dOb) {
        this.dOb = dOb;
    }

    public boolean hasStudentHousing() {
        return hasStudentHousing;
    }

    public void setStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
