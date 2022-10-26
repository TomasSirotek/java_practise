package oop_basics.assign5;

import java.util.List;

public interface IPersonManager {

    Person getPersonById(int id);
    void addPerson(Person p);
    void removePersonById(int id);

    List<Person> getAllPersons();

    List<Student> getAllStudents();

    List<Teacher> getAllTeachers();
}
