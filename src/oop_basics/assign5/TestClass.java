package oop_basics.assign5;

import oop_basics.assign5.manager.IPersonManager;
import oop_basics.assign5.manager.PersonManager;
import oop_basics.assign5.models.GradeInfo;
import oop_basics.assign5.models.Person;
import oop_basics.assign5.models.Student;
import oop_basics.assign5.models.Teacher;

public class TestClass {

    private Person p,p1,p2,p3;
    private Teacher t1,t2;
    private Student s1,s2;

    private final IPersonManager personManager;

    public TestClass(){
        personManager = new PersonManager();
        createPersonObjects();
        setPersonManager();
    }

    private void setPersonManager(){
//        personManager.addPerson(p);
//        personManager.addPerson(p2);
//        personManager.addPerson(p3);
        personManager.addPerson(s1);

        for (Person person: personManager.getAllPersons()
        ) {
            System.out.println(person.toString());
        }
    }
    private void createPersonObjects(){
//        p = new Person(100,"Hans Nielsen");
//        p2 = new Person(100,"Hans Nielsen");
//        p3 = new Person(101,"Niels Hansen");

        t1 = new Teacher(200,"Adriana","A");
        t2 = new Teacher(201,"Tomas","T");
        t1.setEmail("Radoslav@gmail.com");
        t1.addSubject("Multimedia");
        t2.addSubject("Programming");
        s1 = new Student(300,"Adam","CS");
        s2 = new Student(300,"Student 2","BIO");

        s1.addGrade(new GradeInfo("Math",10));
        s1.addGrade(new GradeInfo("Math",5));

        s2.addGrade(new GradeInfo("Math",5));

        s1.setEmail("bib@easv.dk");
        s2.setEmail("test@easv.dk");

//        p.setEmail("Tomas@email");
//        p2.setEmail("Retard@emial");
//        p3.setEmail("picovinaToto@emial.com");
    }
}
