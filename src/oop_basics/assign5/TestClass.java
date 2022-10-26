package oop_basics.assign5;


import java.util.ArrayList;
import java.util.List;

public class TestClass {

    private IPersonManager personManager;
    private List<Person> userList = new ArrayList<>() ;

    public TestClass(){
        this.personManager = new PersonManager();

        Person p = new Person(100,"Hans Nielsen");

        Person p2 = new Person(100,"Hans Nielsen");
        Person p3 = new Person(101,"Niels Hansen");
        p.setEmail("Tomas@email");
        p2.setEmail("Retard@emial");
        p3.setEmail("picovinaToto@emial.com");

        Teacher t1 = new Teacher(200,"Adriana","A");
        Teacher t2 = new Teacher(201,"Tomas","T");
        t1.setEmail("Radoslav@gmail.com");
        t1.addSubject("Multimedia");
        t2.addSubject("Programming");

        Student s1 = new Student(300,"Adam","CS");


        Student s2 = new Student(300,"Student 2","BIO");

        s1.addGrade(new GradeInfo("Math",10));
        s1.addGrade(new GradeInfo("Math",5));

        s2.addGrade(new GradeInfo("Math",5));

        s1.setEmail("bib@easv.dk");
        s2.setEmail("test@easv.dk");
        userList.add(p);
        userList.add(p2);
        userList.add(p3);
        userList.add(t1);
        userList.add(t2);
        userList.add(s1);
        userList.add(s2);
    }

    public List<Person> getUserList() {
        return userList;
    }

    public void setUserList(List<Person> userList) {
        this.userList = userList;
    }
}
