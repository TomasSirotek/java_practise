package oop_basics.assign5.manager;

import oop_basics.assign5.models.Person;
import oop_basics.assign5.models.Student;
import oop_basics.assign5.models.Teacher;

import java.util.List;

public interface IPersonManager {

    Person getPersonById(int id);
    void addPerson(Person p);
    void removePersonById(int id);

    List<Person> getAllPersons();

    List<Student> getAllStudents();

    List<Teacher> getAllTeachers();
}
