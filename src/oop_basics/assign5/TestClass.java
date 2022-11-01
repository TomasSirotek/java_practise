package oop_basics.assign5;

import oop_basics.assign5.manager.IPersonManager;
import oop_basics.assign5.manager.PersonManager;
import oop_basics.assign5.models.GradeInfo;
import oop_basics.assign5.models.Person;
import oop_basics.assign5.models.Student;
import oop_basics.assign5.models.Teacher;

public class TestClass {

    private final IPersonManager personManager;

    public TestClass(){
        personManager = new PersonManager();
        setPersonManager();
    }

    private void setPersonManager(){
        Teacher person = new Teacher(200,"Adriana","A");
        Teacher person2 = new Teacher(201,"Tomas","T");
        person.setEmail("Radoslav@gmail.com");
        Student person3 = new Student(300,"Adam","CS");
        Student person4 = new Student(300,"Student 2","BIO");
        person.addSubject("Programming");
        person2.addSubject("Multimedia");

        personManager.addPerson(person);
        personManager.addPerson(person2);
        personManager.addPerson(person3);
        personManager.addPerson(person4);
        for (Person personn: personManager.getAllPersons()
        ) {
            System.out.println(personn.toString());
        }
    }
}
