package oop_basics.assign5;

import java.util.List;

public class Student extends Person{
    private List<GradeInfo> gradeInfoList;
    private String education;

    public Student(int id, String name, String email) {
        super(id, name, email);
    }


    public List<GradeInfo> getGradeInfoList() {
        return gradeInfoList;
    }

    public String getEducation() {
        return education;
    }

}
