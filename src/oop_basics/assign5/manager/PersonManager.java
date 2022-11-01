package oop_basics.assign5.manager;

import oop_basics.assign5.models.Person;
import oop_basics.assign5.models.Student;
import oop_basics.assign5.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class PersonManager implements IPersonManager {
    List<Person> persons = new ArrayList<>();


    public PersonManager(){
    }

    public Person getPersonById(int id){
        return persons.stream().filter((user) ->
                    user.getId() == id).findFirst().orElseThrow();
    }

    public void addPerson(Person p){
        if(!persons.contains(p)){
            persons.add(p);
        }
    }

    public void removePersonById(int id){
        persons.removeIf(p -> p.getId() == id);
    }

    public List<Person> getAllPersons(){
        return this.persons;
    }
    public List<Student> getAllStudents(){
        List<Student> studentList = new ArrayList<>();
        for (Person p: persons
        ) {
            if(p instanceof Student){
                studentList.add((Student) p);
            }
        }
        return studentList;
    }
    public List<Teacher> getAllTeachers(){
        List<Teacher> teachersList = new ArrayList<>();
        for (Person p: persons
             ) {
            if(p instanceof Teacher){
                teachersList.add((Teacher) p);
            }
        }
        return teachersList;
    }
    public void operation(){

    }

}
