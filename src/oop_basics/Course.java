package oop_basics;

import java.util.Date;

public class Course {
    private String courseTitle;
    private  String courseLevel;
    public Course(String courseTitle,String courseLevel){
        this.courseTitle = courseTitle;
        this.courseLevel = courseLevel;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseLevel() {
        return courseLevel;
    }

    public void setCourseLevel(String courseLevel) {
        this.courseLevel = courseLevel;
    }
}
